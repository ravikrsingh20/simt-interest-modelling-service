package de.rwth.i9.simt.im.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.rwth.i9.simt.ke.lib.algorithm.kpextraction.rake.Rake;
import de.rwth.i9.simt.ke.lib.model.Keyword;
import de.rwth.i9.simt.nlp.opennlp.OpenNLPImplSpring;

@Service("rakeKPExtraction")
public class RAKEKPExtraction {
	private static final Logger log = LoggerFactory.getLogger(RAKEKPExtraction.class);

	@Autowired
	OpenNLPImplSpring openNLPImplSpring;

	public List<Keyword> extractKeyword(String text, int numKeywords) {
		List<Keyword> keywords = new ArrayList<Keyword>();
		List<Keyword> totalKeywords = new ArrayList<Keyword>();
		int keywordCount = 0;
		totalKeywords = Rake.extractKeyword(text, openNLPImplSpring);
		for (Keyword keyword : totalKeywords) {
			if (++keywordCount > numKeywords)
				break;
			keywords.add(keyword);
		}
		log.info("RAKE KeyphraseExtraction");
		return keywords;
	}

}

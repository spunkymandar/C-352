package com.tightcoupling;

import java.util.List;

public class MetaCollection {
    private XMLFetch xmlFetch = new XMLFetch();
    private CSVExport csvExport = new CSVExport();
    private PDFExport pdfExport = new PDFExport();
    private JSONFetch jsonFetch=new JSONFetch();
//    public void collectMetadata() {
//        List<Object> metadata = xmlFetch.fetchMetadata();
//        csvExport.export(metadata);
//    }
//}

public void collectMetadata(int inputType, int outputType) {
    if (outputType == 1) {
        List<Object> metadata = null;
        if (inputType == 1) {
            metadata = xmlFetch.fetchMetadata();
        } else {
            metadata = jsonFetch.fetchMetadata();
        }
        csvExport.export(metadata);
    } else {
        List<Object> metadata = null;
        if (inputType == 1) {
            metadata = xmlFetch.fetchMetadata();
        } else {
            metadata = jsonFetch.fetchMetadata();
        }
        pdfExport.export(metadata);
    }
}
}
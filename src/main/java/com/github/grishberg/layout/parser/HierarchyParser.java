package com.github.grishberg.layout.parser;

import com.android.layoutinspector.model.LayoutFileData;
import com.android.layoutinspector.parser.LayoutFileDataParser;

import java.io.IOException;

public class HierarchyParser {

    public ParsedLayoutHierarchy parse(byte[] bytes) throws IOException {
        LayoutFileData layoutFileData = LayoutFileDataParser.parseFromBytes(bytes,
                LayoutFileDataParser.getSKIPPED_PROPERTIES());
        return new ParsedLayoutHierarchy(layoutFileData);
    }
}

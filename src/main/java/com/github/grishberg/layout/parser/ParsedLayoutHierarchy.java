package com.github.grishberg.layout.parser;

import com.android.layoutinspector.model.LayoutFileData;

public class ParsedLayoutHierarchy {
    private final LayoutFileData layoutFileData;

    public ParsedLayoutHierarchy(LayoutFileData layoutFileData) {
        this.layoutFileData = layoutFileData;
    }

    public Node getRootNode() {
        return new HierarchyNode(null, layoutFileData.getNode());
    }
}

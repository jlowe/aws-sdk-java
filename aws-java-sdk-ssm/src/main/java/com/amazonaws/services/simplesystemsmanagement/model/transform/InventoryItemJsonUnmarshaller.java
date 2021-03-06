/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.util.Map;
import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InventoryItem JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InventoryItemJsonUnmarshaller implements Unmarshaller<InventoryItem, JsonUnmarshallerContext> {

    public InventoryItem unmarshall(JsonUnmarshallerContext context) throws Exception {
        InventoryItem inventoryItem = new InventoryItem();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("TypeName", targetDepth)) {
                    context.nextToken();
                    inventoryItem.setTypeName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SchemaVersion", targetDepth)) {
                    context.nextToken();
                    inventoryItem.setSchemaVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CaptureTime", targetDepth)) {
                    context.nextToken();
                    inventoryItem.setCaptureTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ContentHash", targetDepth)) {
                    context.nextToken();
                    inventoryItem.setContentHash(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Content", targetDepth)) {
                    context.nextToken();
                    inventoryItem.setContent(new ListUnmarshaller<java.util.Map<String, String>>(new MapUnmarshaller<String, String>(context
                            .getUnmarshaller(String.class), context.getUnmarshaller(String.class)))

                    .unmarshall(context));
                }
                if (context.testExpression("Context", targetDepth)) {
                    context.nextToken();
                    inventoryItem.setContext(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return inventoryItem;
    }

    private static InventoryItemJsonUnmarshaller instance;

    public static InventoryItemJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InventoryItemJsonUnmarshaller();
        return instance;
    }
}

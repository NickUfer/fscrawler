/*
 * Licensed to David Pilato under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package fr.pilato.elasticsearch.crawler.fs.client;

import java.util.HashMap;
import java.util.Map;

public class ESSearchHit {
    private String index;
    private String id;
    private Long version;
    private Map<String, Object> source;
    private String sourceAsString;
    private Map<String, ESDocumentField> fields;
    private Map<String, ESHighlightField> highlightFields = new HashMap<>();

    public Map<String, ESDocumentField> getFields() {
        return fields;
    }

    public void setFields(Map<String, ESDocumentField> fields) {
        this.fields = fields;
    }

    public Map<String, Object> getSourceAsMap() {
        return source;
    }

    public void setSourceAsMap(Map<String, Object> source) {
        this.source = source;
    }

    public void setSourceAsString(String sourceAsString) {
        this.sourceAsString = sourceAsString;
    }

    public String getSourceAsString() {
        return sourceAsString;
    }

    public Map<String, ESHighlightField> getHighlightFields() {
        return highlightFields;
    }

    public void addHighlightField(String name, ESHighlightField highlightField) {
        highlightFields.put(name, highlightField);
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

}

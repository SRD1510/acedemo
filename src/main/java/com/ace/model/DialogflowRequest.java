package com.ace.model;

import java.util.List;

public class DialogflowRequest {

    private String responseId;
    private QueryResult queryResult;
    private WebhookStatus webhookStatus;

    // Getters and Setters
    public String getResponseId() {
        return responseId;
    }

    public void setResponseId(String responseId) {
        this.responseId = responseId;
    }

    public QueryResult getQueryResult() {
        return queryResult;
    }

    public void setQueryResult(QueryResult queryResult) {
        this.queryResult = queryResult;
    }

    public WebhookStatus getWebhookStatus() {
        return webhookStatus;
    }

    public void setWebhookStatus(WebhookStatus webhookStatus) {
        this.webhookStatus = webhookStatus;
    }

    // Inner Classes
    public static class QueryResult {
        private String queryText;
        private String action;
        private Parameters parameters;
        private boolean allRequiredParamsPresent;
        private String fulfillmentText;
        private List<FulfillmentMessage> fulfillmentMessages;
        private Intent intent;
        private float intentDetectionConfidence;
        private DiagnosticInfo diagnosticInfo;
        private String languageCode;

        // Getters and Setters
        public String getQueryText() {
            return queryText;
        }

        public void setQueryText(String queryText) {
            this.queryText = queryText;
        }

        public String getAction() {
            return action;
        }

        public void setAction(String action) {
            this.action = action;
        }

        public Parameters getParameters() {
            return parameters;
        }

        public void setParameters(Parameters parameters) {
            this.parameters = parameters;
        }

        public boolean isAllRequiredParamsPresent() {
            return allRequiredParamsPresent;
        }

        public void setAllRequiredParamsPresent(boolean allRequiredParamsPresent) {
            this.allRequiredParamsPresent = allRequiredParamsPresent;
        }

        public String getFulfillmentText() {
            return fulfillmentText;
        }

        public void setFulfillmentText(String fulfillmentText) {
            this.fulfillmentText = fulfillmentText;
        }

        public List<FulfillmentMessage> getFulfillmentMessages() {
            return fulfillmentMessages;
        }

        public void setFulfillmentMessages(List<FulfillmentMessage> fulfillmentMessages) {
            this.fulfillmentMessages = fulfillmentMessages;
        }

        public Intent getIntent() {
            return intent;
        }

        public void setIntent(Intent intent) {
            this.intent = intent;
        }

        public float getIntentDetectionConfidence() {
            return intentDetectionConfidence;
        }

        public void setIntentDetectionConfidence(float intentDetectionConfidence) {
            this.intentDetectionConfidence = intentDetectionConfidence;
        }

        public DiagnosticInfo getDiagnosticInfo() {
            return diagnosticInfo;
        }

        public void setDiagnosticInfo(DiagnosticInfo diagnosticInfo) {
            this.diagnosticInfo = diagnosticInfo;
        }

        public String getLanguageCode() {
            return languageCode;
        }

        public void setLanguageCode(String languageCode) {
            this.languageCode = languageCode;
        }

        // Inner Classes
        public static class Parameters {
            private String Experience;
            private String Cost;
            private String Topic;
            private String Duration;
            private String Language;

            // Getters and Setters
            public String getExperience() {
                return Experience;
            }

            public void setExperience(String experience) {
                Experience = experience;
            }

            public String getCost() {
                return Cost;
            }

            public void setCost(String cost) {
                Cost = cost;
            }

            public String getTopic() {
                return Topic;
            }

            public void setTopic(String topic) {
                Topic = topic;
            }

            public String getDuration() {
                return Duration;
            }

            public void setDuration(String duration) {
                Duration = duration;
            }

            public String getLanguage() {
                return Language;
            }

            public void setLanguage(String language) {
                Language = language;
            }
        }

        public static class FulfillmentMessage {
            private Text text;

            // Getters and Setters
            public Text getText() {
                return text;
            }

            public void setText(Text text) {
                this.text = text;
            }

            public static class Text {
                private List<String> text;

                // Getters and Setters
                public List<String> getText() {
                    return text;
                }

                public void setText(List<String> text) {
                    this.text = text;
                }
            }
        }

        public static class Intent {
            private String name;
            private String displayName;

            // Getters and Setters
            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getDisplayName() {
                return displayName;
            }

            public void setDisplayName(String displayName) {
                this.displayName = displayName;
            }
        }

        public static class DiagnosticInfo {
            private int webhook_latency_ms;

            // Getters and Setters
            public int getWebhook_latency_ms() {
                return webhook_latency_ms;
            }

            public void setWebhook_latency_ms(int webhook_latency_ms) {
                this.webhook_latency_ms = webhook_latency_ms;
            }
        }
    }

    public static class WebhookStatus {
        private String message;

        // Getters and Setters
        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}

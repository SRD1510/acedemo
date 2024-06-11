package com.ace.model;

import java.util.List;

public class DialogflowResponse {
    private String fulfillmentText;
    private List<FulfillmentMessage> fulfillmentMessages;

    // Getters and Setters
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
}


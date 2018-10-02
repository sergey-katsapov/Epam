package vechile;

abstract public class LinerModel {

        private String bodyType;

        String getBodyType() {
            return this.bodyType;
        }

        public void setBodyType(String bodyType) {
            this.bodyType = bodyType;
        }

        @Override
        public String toString() {
            return bodyType;
        }
    }


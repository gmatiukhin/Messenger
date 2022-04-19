package matiukhin.grigorii.messenger.utilities.communication.messages;

import matiukhin.grigorii.messenger.utilities.communication.responses.Response;

public record LoadActiveConversationsMessage(String sender) implements Message {
    @Override
    public Response accept(MessageVisitor visitor) {
        return visitor.visit(this);
    }
}

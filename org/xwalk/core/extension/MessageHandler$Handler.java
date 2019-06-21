package org.xwalk.core.extension;

public class MessageHandler$Handler
{
  String javaName;
  ReflectionHelper reflection;
  Object targetObject;
  ReflectionHelper.MemberType type;

  public MessageHandler$Handler(MessageHandler paramMessageHandler, String paramString, ReflectionHelper.MemberType paramMemberType, Object paramObject)
  {
    this(paramMessageHandler, paramString, paramMemberType, paramObject, null);
  }

  public MessageHandler$Handler(MessageHandler paramMessageHandler, String paramString, ReflectionHelper.MemberType paramMemberType, Object paramObject, ReflectionHelper paramReflectionHelper)
  {
    this.type = paramMemberType;
    this.javaName = paramString;
    this.targetObject = paramObject;
    this.reflection = paramReflectionHelper;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     org.xwalk.core.extension.MessageHandler.Handler
 * JD-Core Version:    0.6.2
 */
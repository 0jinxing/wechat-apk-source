package com.facebook.appevents.internal;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum SubscriptionType
{
  static
  {
    AppMethodBeat.i(72231);
    NEW = new SubscriptionType("NEW", 0);
    HEARTBEAT = new SubscriptionType("HEARTBEAT", 1);
    EXPIRE = new SubscriptionType("EXPIRE", 2);
    CANCEL = new SubscriptionType("CANCEL", 3);
    RESTORE = new SubscriptionType("RESTORE", 4);
    DUPLICATED = new SubscriptionType("DUPLICATED", 5);
    UNKNOWN = new SubscriptionType("UNKNOWN", 6);
    $VALUES = new SubscriptionType[] { NEW, HEARTBEAT, EXPIRE, CANCEL, RESTORE, DUPLICATED, UNKNOWN };
    AppMethodBeat.o(72231);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.internal.SubscriptionType
 * JD-Core Version:    0.6.2
 */
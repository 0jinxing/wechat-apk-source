package com.facebook.appevents;

import com.tencent.matrix.trace.core.AppMethodBeat;

 enum FlushReason
{
  static
  {
    AppMethodBeat.i(72006);
    EXPLICIT = new FlushReason("EXPLICIT", 0);
    TIMER = new FlushReason("TIMER", 1);
    SESSION_CHANGE = new FlushReason("SESSION_CHANGE", 2);
    PERSISTED_EVENTS = new FlushReason("PERSISTED_EVENTS", 3);
    EVENT_THRESHOLD = new FlushReason("EVENT_THRESHOLD", 4);
    EAGER_FLUSHING_EVENT = new FlushReason("EAGER_FLUSHING_EVENT", 5);
    $VALUES = new FlushReason[] { EXPLICIT, TIMER, SESSION_CHANGE, PERSISTED_EVENTS, EVENT_THRESHOLD, EAGER_FLUSHING_EVENT };
    AppMethodBeat.o(72006);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.FlushReason
 * JD-Core Version:    0.6.2
 */
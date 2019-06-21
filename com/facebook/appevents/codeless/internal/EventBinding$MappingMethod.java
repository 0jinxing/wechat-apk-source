package com.facebook.appevents.codeless.internal;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum EventBinding$MappingMethod
{
  static
  {
    AppMethodBeat.i(72096);
    MANUAL = new MappingMethod("MANUAL", 0);
    INFERENCE = new MappingMethod("INFERENCE", 1);
    $VALUES = new MappingMethod[] { MANUAL, INFERENCE };
    AppMethodBeat.o(72096);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.codeless.internal.EventBinding.MappingMethod
 * JD-Core Version:    0.6.2
 */
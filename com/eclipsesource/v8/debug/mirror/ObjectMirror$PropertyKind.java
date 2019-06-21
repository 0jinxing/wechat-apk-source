package com.eclipsesource.v8.debug.mirror;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum ObjectMirror$PropertyKind
{
  int index;

  static
  {
    AppMethodBeat.i(74889);
    Named = new PropertyKind("Named", 0, 1);
    Indexed = new PropertyKind("Indexed", 1, 2);
    $VALUES = new PropertyKind[] { Named, Indexed };
    AppMethodBeat.o(74889);
  }

  private ObjectMirror$PropertyKind(int paramInt)
  {
    this.index = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.debug.mirror.ObjectMirror.PropertyKind
 * JD-Core Version:    0.6.2
 */
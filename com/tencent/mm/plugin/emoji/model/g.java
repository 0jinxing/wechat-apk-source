package com.tencent.mm.plugin.emoji.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.gb;
import com.tencent.mm.sdk.b.c;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class g
{
  Set<String> kVv;
  c<gb> kVw;
  private d.a kVx;

  public g()
  {
    AppMethodBeat.i(53052);
    this.kVw = new g.1(this);
    this.kVx = new g.2(this);
    this.kVv = Collections.synchronizedSet(new HashSet());
    j.bkh().kVj = this.kVx;
    this.kVw.dnU();
    AppMethodBeat.o(53052);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.model.g
 * JD-Core Version:    0.6.2
 */
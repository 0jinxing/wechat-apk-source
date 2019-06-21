package com.tencent.mm.plugin.nearlife.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.axw;
import com.tencent.mm.protocal.protobuf.bts;
import java.util.LinkedList;

public final class a
{
  public String Title;
  public int dtW;
  public int jCt;
  public String nQA;
  public String nQB;
  public String oQU;
  public float oQV;
  public int oQW;
  public LinkedList<Integer> oQX;
  public int oQY;
  public LinkedList<bts> oQZ;
  public float oRa;
  public String oRb;
  public SKBuiltinBuffer_t oRc;
  public axw oRd;

  public a(String paramString, axw paramaxw)
  {
    AppMethodBeat.i(22923);
    this.oQX = new LinkedList();
    this.oQZ = new LinkedList();
    this.nQA = paramString;
    this.oQU = paramaxw.oQU;
    this.Title = paramaxw.Title;
    this.oQV = paramaxw.oQV;
    this.oQW = paramaxw.oQW;
    this.oQX = paramaxw.oQX;
    this.oQY = paramaxw.oQY;
    this.oQZ = paramaxw.oQZ;
    this.oRa = paramaxw.oRa;
    this.oRb = paramaxw.oRb;
    this.jCt = paramaxw.jCt;
    this.oRc = paramaxw.oRc;
    this.dtW = paramaxw.wCe;
    this.oRd = paramaxw;
    AppMethodBeat.o(22923);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearlife.b.a
 * JD-Core Version:    0.6.2
 */
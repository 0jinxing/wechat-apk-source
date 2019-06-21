package com.tencent.mm.ag;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b
{
  public String appId = "";
  public boolean ckA = true;
  public String ckD = "";
  public String clP = "";
  public int csK = 0;
  public String filePath = "";
  public long fileSize = 0L;
  public int fqJ = 0;
  public boolean fqK = false;
  public boolean fqL = false;
  public long fqM = 0L;
  public double fqN = 1.0D;
  public long fqO = 0L;
  public long fqP = 0L;
  public long fqQ = 0L;
  public long fqR = 0L;
  public long fqS = 0L;
  public long fqT = 0L;
  public long fqU = 0L;
  public e fqV;
  public boolean fqW = false;
  public boolean fqX = false;
  public int fromScene = 0;
  public String processName = "";
  public int startTime = 0;

  public final boolean e(b paramb)
  {
    boolean bool = false;
    AppMethodBeat.i(137228);
    if (paramb == null)
      AppMethodBeat.o(137228);
    while (true)
    {
      return bool;
      if ((this.ckD != null) && (this.ckD.equalsIgnoreCase(paramb.ckD)) && (this.clP != null) && (this.clP.equalsIgnoreCase(paramb.clP)))
      {
        bool = true;
        AppMethodBeat.o(137228);
      }
      else
      {
        AppMethodBeat.o(137228);
      }
    }
  }

  public final void f(b paramb)
  {
    AppMethodBeat.i(137229);
    this.ckD = paramb.ckD;
    this.clP = paramb.clP;
    if (!TextUtils.isEmpty(paramb.filePath))
      this.filePath = paramb.filePath;
    this.startTime = paramb.startTime;
    this.fqJ = paramb.fqJ;
    this.fqK = paramb.fqK;
    this.fqL = paramb.fqL;
    this.fromScene = paramb.fromScene;
    this.processName = paramb.processName;
    this.fqN = paramb.fqN;
    this.appId = paramb.appId;
    if (paramb.fqV != null)
      this.fqV = paramb.fqV;
    this.fileSize = paramb.fileSize;
    AppMethodBeat.o(137229);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ag.b
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.ui.transmit;

import android.app.Dialog;
import android.content.Context;
import android.os.AsyncTask;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.cfh;
import com.tencent.mm.sdk.platformtools.ak;

public final class MsgRetransmitUI$a extends AsyncTask<Object, Object, String>
{
  public String cMn;
  public Context context;
  public String dqJ;
  public int fVl;
  public int fXd;
  public String fileName;
  public Dialog gII;
  private ak mHandler;
  public String userName;
  public boolean zIU;
  public int zIW;
  public boolean zJA;
  public String zJB;
  public boolean zJC;
  public boolean zJD;
  public boolean zJE;
  public cfh zJF;
  public MsgRetransmitUI.b zJG;

  public MsgRetransmitUI$a()
  {
    AppMethodBeat.i(35087);
    this.zJC = true;
    this.zJD = false;
    this.zIU = false;
    this.zJE = true;
    this.zJF = null;
    this.zJG = null;
    this.mHandler = new ak();
    AppMethodBeat.o(35087);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.MsgRetransmitUI.a
 * JD-Core Version:    0.6.2
 */
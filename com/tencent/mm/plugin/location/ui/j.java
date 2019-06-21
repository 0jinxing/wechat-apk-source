package com.tencent.mm.plugin.location.ui;

import android.content.Context;
import android.graphics.Color;
import android.os.Looper;
import android.os.Message;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.location.model.l;
import com.tencent.mm.plugin.location.model.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class j
{
  TextView TF;
  Context context;
  private String elp;
  ak mHandler;
  boolean nMO;
  private ViewGroup nMQ;
  ArrayList<String> nMR;
  private final int nMS;
  private final int nMT;
  private final int nMU;
  private final int nMV;
  private final int nMW;
  private final int nMX;
  private final int nMY;
  private final int nMZ;
  private final int nNa;
  private final int nNb;
  private final int nNc;
  boolean nNd;
  private int nNe;
  int nNf;
  int nNg;
  int nNh;
  boolean nNi;
  String nNj;

  public j(Context paramContext, ViewGroup paramViewGroup, String paramString)
  {
    AppMethodBeat.i(113522);
    this.nMS = 100;
    this.nMT = 1;
    this.nMU = 2;
    this.nMV = 3;
    this.nMW = 4;
    this.nMX = 5;
    this.nMY = 6;
    this.nMZ = 7;
    this.nNa = 8;
    this.nNb = 9;
    this.nNc = 10;
    this.nNd = true;
    this.nNe = Color.parseColor("#44FEBB");
    this.nNf = Color.parseColor("#FFFFFF");
    this.nNg = Color.parseColor("#E54646");
    this.nNh = Color.parseColor("#FFC90C");
    this.nMO = false;
    this.nNi = false;
    this.nNj = "";
    this.mHandler = new j.1(this, Looper.getMainLooper());
    this.context = paramContext;
    this.nMQ = paramViewGroup;
    this.TF = ((TextView)this.nMQ.findViewById(2131820678));
    this.elp = paramString;
    init();
    AppMethodBeat.o(113522);
  }

  private void init()
  {
    AppMethodBeat.i(113523);
    ab.d("MicroMsg.ShareHeaderMsgMgr", "init");
    this.TF.invalidate();
    this.nMR = new ArrayList();
    Iterator localIterator = l.bJz().tP(this.elp).iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      this.nMR.add(str);
    }
    iC(false);
    AppMethodBeat.o(113523);
  }

  final void iC(boolean paramBoolean)
  {
    AppMethodBeat.i(113524);
    this.mHandler.removeMessages(2);
    Message localMessage = Message.obtain();
    localMessage.what = 2;
    localMessage.obj = Integer.valueOf(this.nMR.size());
    ab.d("MicroMsg.ShareHeaderMsgMgr", "updateMemberCount, size=%d, isDelay=%b", new Object[] { Integer.valueOf(this.nMR.size()), Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      this.mHandler.sendMessageDelayed(localMessage, 100L);
      AppMethodBeat.o(113524);
    }
    while (true)
    {
      return;
      this.mHandler.sendMessage(localMessage);
      AppMethodBeat.o(113524);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.j
 * JD-Core Version:    0.6.2
 */
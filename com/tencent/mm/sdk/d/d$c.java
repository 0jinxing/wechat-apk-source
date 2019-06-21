package com.tencent.mm.sdk.d;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.HashMap;

public final class d$c extends Handler
{
  private static final Object xCH;
  private boolean iAB;
  private boolean xCG;
  private Message xCI;
  private d.b xCJ;
  private boolean xCK;
  private d.c.c[] xCL;
  private int xCM;
  private d.c.c[] xCN;
  private int xCO;
  private d.c.a xCP;
  private d.c.b xCQ;
  private HashMap<c, d.c.c> xCR;
  private c xCS;
  private c xCT;
  private ArrayList<Message> xCU;
  private d xCv;

  static
  {
    AppMethodBeat.i(52472);
    xCH = new Object();
    AppMethodBeat.o(52472);
  }

  private d$c(Looper paramLooper, d paramd)
  {
    super(paramLooper);
    AppMethodBeat.i(52464);
    this.iAB = false;
    this.xCG = false;
    this.xCJ = new d.b((byte)0);
    this.xCM = -1;
    this.xCP = new d.c.a(this, (byte)0);
    this.xCQ = new d.c.b(this, (byte)0);
    this.xCR = new HashMap();
    this.xCU = new ArrayList();
    this.xCv = paramd;
    c(this.xCP);
    c(this.xCQ);
    AppMethodBeat.o(52464);
  }

  private final void Md(int paramInt)
  {
    AppMethodBeat.i(52460);
    while (paramInt <= this.xCM)
    {
      if (this.xCG)
        new StringBuilder("invokeEnterMethods: ").append(this.xCL[paramInt].xCW.getName());
      this.xCL[paramInt].xCW.enter();
      this.xCL[paramInt].active = true;
      paramInt++;
    }
    AppMethodBeat.o(52460);
  }

  private void a(c paramc, Message paramMessage)
  {
    AppMethodBeat.i(52457);
    Object localObject = this.xCL[this.xCM].xCW;
    int i;
    if ((this.xCv.i(this.xCI)) && (paramMessage.obj != xCH))
    {
      i = 1;
      if (!this.xCJ.dpR())
        break label225;
      if (this.xCT != null)
        this.xCJ.b(this.xCv, this.xCI, "", paramc, (a)localObject, this.xCT);
    }
    while (true)
    {
      paramc = this.xCT;
      if (paramc == null)
        break label375;
      while (true)
      {
        this.xCO = 0;
        paramMessage = (d.c.c)this.xCR.get(paramc);
        do
        {
          localObject = this.xCN;
          i = this.xCO;
          this.xCO = (i + 1);
          localObject[i] = paramMessage;
          localObject = paramMessage.xCX;
          if (localObject == null)
            break;
          paramMessage = (Message)localObject;
        }
        while (!((d.c.c)localObject).active);
        if (this.xCG)
          new StringBuilder("setupTempStateStackWithStatesToEnter: X mTempStateStackCount=").append(this.xCO).append(",curStateInfo: ").append(localObject);
        a((d.c.c)localObject);
        Md(dpT());
        dpS();
        if (paramc == this.xCT)
          break;
        paramc = this.xCT;
      }
      i = 0;
      break;
      label225: if (i != 0)
        this.xCJ.b(this.xCv, this.xCI, "", paramc, (a)localObject, this.xCT);
    }
    this.xCT = null;
    label375: 
    while (true)
    {
      if ((paramc != null) && (paramc == this.xCQ))
      {
        this.xCv.avC();
        if (this.xCv.xCu != null)
        {
          getLooper().quit();
          this.xCv.xCu = null;
        }
        this.xCv.xCt = null;
        this.xCv = null;
        this.xCI = null;
        this.xCJ.cleanup();
        this.xCL = null;
        this.xCN = null;
        this.xCR.clear();
        this.xCS = null;
        this.xCT = null;
        this.xCU.clear();
        this.iAB = true;
      }
      AppMethodBeat.o(52457);
      return;
    }
  }

  private final void a(d.c.c paramc)
  {
    AppMethodBeat.i(52459);
    while ((this.xCM >= 0) && (this.xCL[this.xCM] != paramc))
    {
      c localc = this.xCL[this.xCM].xCW;
      if (this.xCG)
        new StringBuilder("invokeExitMethods: ").append(localc.getName());
      localc.exit();
      this.xCL[this.xCM].active = false;
      this.xCM -= 1;
    }
    AppMethodBeat.o(52459);
  }

  private final void b(a parama)
  {
    AppMethodBeat.i(52465);
    this.xCT = ((c)parama);
    if (this.xCG)
      new StringBuilder("transitionTo: destState=").append(this.xCT.getName());
    AppMethodBeat.o(52465);
  }

  private final d.c.c c(c paramc)
  {
    AppMethodBeat.i(52463);
    if (this.xCG)
      new StringBuilder("addStateInternal: E state=").append(paramc.getName()).append(",parent=");
    d.c.c localc1 = (d.c.c)this.xCR.get(paramc);
    d.c.c localc2 = localc1;
    if (localc1 == null)
    {
      localc2 = new d.c.c(this, (byte)0);
      this.xCR.put(paramc, localc2);
    }
    if ((localc2.xCX != null) && (localc2.xCX != null))
    {
      paramc = new RuntimeException("state already added");
      AppMethodBeat.o(52463);
      throw paramc;
    }
    localc2.xCW = paramc;
    localc2.xCX = null;
    localc2.active = false;
    if (this.xCG)
      new StringBuilder("addStateInternal: X stateInfo: ").append(localc2);
    AppMethodBeat.o(52463);
    return localc2;
  }

  private final void dpS()
  {
    AppMethodBeat.i(52461);
    for (int i = this.xCU.size() - 1; i >= 0; i--)
    {
      Message localMessage = (Message)this.xCU.get(i);
      if (this.xCG)
        new StringBuilder("moveDeferredMessageAtFrontOfQueue; what=").append(localMessage.what);
      sendMessageAtFrontOfQueue(localMessage);
    }
    this.xCU.clear();
    AppMethodBeat.o(52461);
  }

  private final int dpT()
  {
    AppMethodBeat.i(52462);
    int i = this.xCM + 1;
    int j = this.xCO - 1;
    int k = i;
    while (j >= 0)
    {
      if (this.xCG)
        new StringBuilder("moveTempStackToStateStack: i=").append(j).append(",j=").append(k);
      this.xCL[k] = this.xCN[j];
      k++;
      j--;
    }
    this.xCM = (k - 1);
    if (this.xCG)
      new StringBuilder("moveTempStackToStateStack: X mStateStackTop=").append(this.xCM).append(",startingIndex=").append(i).append(",Top=").append(this.xCL[this.xCM].xCW.getName());
    AppMethodBeat.o(52462);
    return i;
  }

  private final c t(Message paramMessage)
  {
    AppMethodBeat.i(52458);
    Object localObject1 = this.xCL[this.xCM];
    if (this.xCG)
      new StringBuilder("processMsg: ").append(((d.c.c)localObject1).xCW.getName());
    int i;
    Object localObject2;
    if ((paramMessage.what == -1) && (paramMessage.obj == xCH))
    {
      i = 1;
      localObject2 = localObject1;
      if (i == 0)
        break label135;
      b(this.xCQ);
      label79: if (localObject1 == null)
        break label171;
      paramMessage = ((d.c.c)localObject1).xCW;
      AppMethodBeat.o(52458);
    }
    while (true)
    {
      return paramMessage;
      i = 0;
      break;
      label135: 
      do
      {
        localObject2 = localObject1;
        if (this.xCG)
        {
          new StringBuilder("processMsg: ").append(((d.c.c)localObject1).xCW.getName());
          localObject2 = localObject1;
        }
        localObject1 = localObject2;
        if (localObject2.xCW.k(paramMessage))
          break;
        localObject1 = localObject2.xCX;
      }
      while (localObject1 != null);
      this.xCv.j(paramMessage);
      break label79;
      label171: paramMessage = null;
      AppMethodBeat.o(52458);
    }
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(52456);
    c localc;
    if (!this.iAB)
    {
      if (this.xCG)
        new StringBuilder("handleMessage: E msg.what=").append(paramMessage.what);
      this.xCI = paramMessage;
      localc = null;
      if (!this.xCK)
        break label71;
      localc = t(paramMessage);
    }
    while (true)
    {
      a(localc, paramMessage);
      AppMethodBeat.o(52456);
      return;
      label71: if ((this.xCK) || (this.xCI.what != -2) || (this.xCI.obj != xCH))
        break;
      this.xCK = true;
      Md(0);
    }
    paramMessage = new RuntimeException("StateMachine.handleMessage: The start method not called, received msg: ".concat(String.valueOf(paramMessage)));
    AppMethodBeat.o(52456);
    throw paramMessage;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.d.d.c
 * JD-Core Version:    0.6.2
 */
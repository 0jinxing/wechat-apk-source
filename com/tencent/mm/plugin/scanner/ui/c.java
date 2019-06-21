package com.tencent.mm.plugin.scanner.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w;
import com.tencent.mm.g.a.pp;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.scanner.util.k;
import com.tencent.mm.protocal.protobuf.la;
import com.tencent.mm.protocal.protobuf.lb;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public abstract class c extends i
  implements com.tencent.mm.plugin.scanner.util.b.a
{
  private long qaM;
  int qaN = 0;
  private HighlightRectSideView qaO;
  m qaP = null;
  private com.tencent.mm.ui.base.p qaQ = null;
  private com.tencent.mm.ui.widget.a.c qaR = null;

  public c(i.b paramb, Point paramPoint, DisplayMetrics paramDisplayMetrics, int paramInt)
  {
    super(paramb, paramPoint);
    this.qer = 0;
    this.qes = 0;
    float f = cgK();
    int i;
    if (paramInt == 1)
    {
      paramPoint = new Point(paramDisplayMetrics.widthPixels, paramDisplayMetrics.heightPixels);
      paramInt = (int)(paramPoint.y * 0.8F);
      i = (int)(paramPoint.x * 0.8F);
      if (paramInt * f <= paramPoint.x)
        break label226;
      paramInt = (int)(i / f);
      label110: Point localPoint = new Point((int)(i / paramDisplayMetrics.density), (int)(paramInt / paramDisplayMetrics.density));
      this.qes = ((int)((paramPoint.y / paramDisplayMetrics.density - localPoint.y) / 2.0F));
      fd(localPoint.x, localPoint.y);
      if (bo.gO(paramb.getContext()) >= 100L)
        break label238;
      ab.w("MicroMsg.BaseScanModeLicence", "memory is not much");
    }
    label226: label238: for (this.qaM = 280L; ; this.qaM = 80L)
    {
      return;
      paramPoint = new Point(paramDisplayMetrics.heightPixels, paramDisplayMetrics.widthPixels);
      break;
      i = (int)(paramInt * f);
      break label110;
    }
  }

  private void BW(int paramInt)
  {
    if ((paramInt & 0x20) > 0)
      paramInt = 2131302750;
    while (true)
    {
      Toast.makeText(this.qet.getContext(), paramInt, 0).show();
      return;
      if ((paramInt & 0x40) > 0)
        paramInt = 2131302751;
      else
        paramInt = 2131302749;
    }
  }

  private void C(int paramInt, String paramString1, String paramString2)
  {
    pp localpp;
    if (paramInt == 0)
    {
      localpp = new pp();
      localpp.cLM.cardType = paramString1;
      localpp.cLM.cLN = 1;
      localpp.cLM.cLO = paramString2;
      if ((this.qen instanceof k))
        localpp.cLM.cLP = ((k)this.qen).qir;
      a.xxA.a(localpp, Looper.getMainLooper());
      if (this.qaQ != null)
        this.qaQ.dismiss();
      this.qet.getContext().finish();
    }
    while (true)
    {
      return;
      if (((paramInt & 0x2) > 0) && ((paramInt & 0x1) > 0))
      {
        localpp = new pp();
        localpp.cLM.cardType = paramString1;
        localpp.cLM.cLN = 0;
        localpp.cLM.cLO = paramString2;
        a.xxA.a(localpp, Looper.getMainLooper());
        if (this.qaQ != null)
          this.qaQ.dismiss();
        this.qet.getContext().finish();
      }
      else if (this.qaN >= 3)
      {
        localpp = new pp();
        localpp.cLM.cardType = paramString1;
        localpp.cLM.cLN = 1;
        localpp.cLM.cLO = paramString2;
        if ((this.qen instanceof k))
          localpp.cLM.cLP = ((k)this.qen).qir;
        a.xxA.a(localpp, Looper.getMainLooper());
        if (this.qaQ != null)
          this.qaQ.dismiss();
        this.qet.getContext().finish();
      }
      else if (((paramInt & 0x1) > 0) && (this.qaN < 3))
      {
        if (this.qaQ != null)
          this.qaQ.dismiss();
        cgO().chP();
        BW(paramInt);
        cgU();
      }
      else
      {
        localpp = new pp();
        localpp.cLM.cardType = paramString1;
        localpp.cLM.cLN = 0;
        localpp.cLM.cLO = paramString2;
        a.xxA.a(localpp, Looper.getMainLooper());
        if (this.qaQ != null)
          this.qaQ.dismiss();
        this.qet.getContext().finish();
      }
    }
  }

  private void cgU()
  {
    boolean[] arrayOfBoolean = ((k)this.qen).cih();
    this.qaO.setShowRectEdges(arrayOfBoolean);
    this.qet.jK(this.qaM);
  }

  public final void K(Bundle paramBundle)
  {
  }

  protected abstract com.tencent.mm.plugin.scanner.util.b a(com.tencent.mm.plugin.scanner.util.b.a parama);

  public void b(int paramInt1, String paramString, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3)
  {
    ab.d("MicroMsg.BaseScanModeLicence", "onDecodeSuccess");
    paramArrayOfByte1 = ((k)this.qen).qir;
    paramString = cgL();
    if (this.qaQ != null)
      this.qaQ.dismiss();
    paramArrayOfByte2 = this.qet.getContext();
    paramArrayOfByte2.getString(2131297061);
    this.qaQ = h.b(paramArrayOfByte2, paramArrayOfByte2.getString(2131302752), false, null);
    this.qaQ.setOnKeyListener(new c.2(this, paramString));
    paramArrayOfByte2 = new com.tencent.mm.ai.b.a();
    paramArrayOfByte2.fsJ = new la();
    paramArrayOfByte2.fsK = new lb();
    paramArrayOfByte2.uri = "/cgi-bin/mmbiz-bin/usrmsg/bizscanlicense";
    paramArrayOfByte2.fsI = 1803;
    paramArrayOfByte2 = paramArrayOfByte2.acD();
    Object localObject = new ByteArrayOutputStream();
    if (!paramArrayOfByte1.compress(Bitmap.CompressFormat.JPEG, 80, (OutputStream)localObject))
      C(2, paramString, "");
    while (true)
    {
      return;
      localObject = ((ByteArrayOutputStream)localObject).toByteArray();
      if (!bo.cb((byte[])localObject))
        break;
      C(2, paramString, "");
    }
    paramArrayOfByte1 = (la)paramArrayOfByte2.fsG.fsP;
    paramArrayOfByte1.vOx = new com.tencent.mm.bt.b((byte[])localObject);
    if (paramString.equals("driving"))
      paramArrayOfByte1.vOw = 0;
    while (true)
    {
      this.qaP = w.a(paramArrayOfByte2, new c.1(this, paramString), false);
      break;
      if (paramString.equals("identity"))
        paramArrayOfByte1.vOw = 1;
    }
  }

  protected abstract float cgK();

  protected abstract String cgL();

  protected abstract int cgM();

  protected final void cgN()
  {
  }

  protected final com.tencent.mm.plugin.scanner.util.b cgO()
  {
    if (this.qen == null)
      this.qen = a(this);
    return this.qen;
  }

  protected final int cgP()
  {
    return 2130970547;
  }

  protected final int cgQ()
  {
    return 0;
  }

  protected final void cgR()
  {
  }

  protected final boolean cgS()
  {
    return false;
  }

  protected final boolean cgT()
  {
    return false;
  }

  protected final void dw(View paramView)
  {
    if (paramView != null)
    {
      TextView localTextView = (TextView)paramView.findViewById(2131827211);
      if (localTextView != null)
        localTextView.setText(paramView.getContext().getString(2131302747, new Object[] { paramView.getContext().getString(cgM()) }));
    }
  }

  protected final void j(Rect paramRect)
  {
    ab.d("MicroMsg.BaseScanModeLicence", "smoothie, maskRect = %s", new Object[] { paramRect });
    HighlightRectSideView localHighlightRectSideView = (HighlightRectSideView)this.qet.findViewById(2131827210);
    if (localHighlightRectSideView != null)
      localHighlightRectSideView.setMaskRect(paramRect);
    this.qaO = localHighlightRectSideView;
  }

  public final void jJ(long paramLong)
  {
    ab.d("MicroMsg.BaseScanModeLicence", "onDecodeFail");
    if (this.qet == null)
      ab.e("MicroMsg.BaseScanModeLicence", "ui callback is null");
    while (true)
    {
      return;
      cgU();
    }
  }

  protected final void onDestroy()
  {
  }

  protected final void onResume()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.c
 * JD-Core Version:    0.6.2
 */
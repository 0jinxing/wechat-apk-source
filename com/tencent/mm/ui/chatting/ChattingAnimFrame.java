package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ba.d;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.gif.MMAnimateView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChattingAnimFrame extends FrameLayout
{
  private static String kTY = "";
  private int aKu;
  private int aKv;
  private int mScreenHeight;
  private int xCD;
  List<MMAnimateView> yHT;
  private int yHU;
  private int yHV;
  private boolean yHW;
  private int yHX;
  private ArrayList<Integer> yHY;

  public ChattingAnimFrame(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(30518);
    this.yHT = new ArrayList();
    this.yHU = 30;
    this.yHV = 30;
    this.xCD = 40;
    this.yHW = false;
    this.yHX = 0;
    this.yHY = new ArrayList();
    this.mScreenHeight = a.ge(getContext());
    AppMethodBeat.o(30518);
  }

  private void Oj(int paramInt)
  {
    AppMethodBeat.i(30522);
    if (paramInt <= 0)
    {
      ab.w("MicroMsg.ChattingAnimFrame", "count is zero.");
      AppMethodBeat.o(30522);
    }
    while (true)
    {
      return;
      int i = (int)(paramInt * 0.1D);
      if (this.yHY != null)
        this.yHY.clear();
      while (this.yHY.size() < i)
      {
        int j = (int)Y(0.0F, paramInt);
        if (!this.yHY.contains(Integer.valueOf(j)))
        {
          this.yHY.add(Integer.valueOf(j));
          continue;
          this.yHY = new ArrayList();
        }
      }
      AppMethodBeat.o(30522);
    }
  }

  static float Y(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(30524);
    float f = (float)Math.random();
    AppMethodBeat.o(30524);
    return f * (paramFloat2 - paramFloat1) + paramFloat1;
  }

  private static String getDataEmojiPath()
  {
    AppMethodBeat.i(30517);
    if (bo.isNullOrNil(kTY))
    {
      kTY = com.tencent.mm.compatible.util.e.eSk.replace("/data/user/0", "/data/data");
      kTY += "/emoji";
    }
    String str = kTY;
    AppMethodBeat.o(30517);
    return str;
  }

  public final void a(d paramd)
  {
    AppMethodBeat.i(30521);
    stop();
    if (paramd == null)
    {
      ab.w("MicroMsg.ChattingAnimFrame", "egg info is null. ignore.");
      AppMethodBeat.o(30521);
    }
    while (true)
    {
      return;
      String str = getDataEmojiPath() + "/egg/" + paramd.fMd;
      if (!com.tencent.mm.vfs.e.ct(str))
      {
        ab.w("MicroMsg.ChattingAnimFrame", "egg file isn't exist. ignore");
        AppMethodBeat.o(30521);
      }
      else
      {
        setVisibility(0);
        label130: label145: int i;
        label219: int j;
        int k;
        boolean bool;
        label294: Object localObject;
        if (paramd.fMf > 0)
        {
          this.yHU = paramd.fMf;
          if (this.yHU > 60)
            this.yHU = 60;
          if (paramd.fMg <= 0)
            break label457;
          this.yHV = paramd.fMg;
          if (paramd.maxSize <= 0)
            break label466;
          this.xCD = paramd.maxSize;
          ab.i("MicroMsg.ChattingAnimFrame", "Egg viewCount:%d minSize:%d maxSize:%d AnimType:%d reportType:%d", new Object[] { Integer.valueOf(this.yHU), Integer.valueOf(this.yHV), Integer.valueOf(this.xCD), Integer.valueOf(paramd.fMe), Integer.valueOf(paramd.cKB) });
          l = 0L;
          Oj(this.yHU);
          i = 0;
          if (i >= this.yHU)
            break label575;
          j = this.yHV;
          k = this.xCD;
          j = (int)Y(j, k);
          k = a.fromDPToPix(getContext(), j);
          j = paramd.fMe;
          if ((this.yHY == null) || (!this.yHY.contains(Integer.valueOf(i))))
            break label475;
          bool = true;
          localObject = new ChattingAnimFrame.c(this, j, k, l, bool);
          MMAnimateView localMMAnimateView = new MMAnimateView(getContext());
          localMMAnimateView.setImageFilePath(str);
          localMMAnimateView.setAnimation((Animation)localObject);
          localMMAnimateView.setLayerType(2, null);
          ((ChattingAnimFrame.c)localObject).yIo = localMMAnimateView;
          localMMAnimateView.setLayoutParams(new FrameLayout.LayoutParams(((ChattingAnimFrame.c)localObject).mSize, ((ChattingAnimFrame.c)localObject).mSize));
          this.yHT.add(localMMAnimateView);
          addView(localMMAnimateView);
          j = paramd.fMe;
          k = this.yHU;
        }
        switch (j)
        {
        default:
        case 3:
          for (l = (int)(Y(0.0F, 4.0F) * 1000.0F); ; l += ()((Math.abs(i - k * 0.5D - 5.0D) / (k * 6) + 0.06D) * 1000.0D))
          {
            i++;
            break label219;
            this.yHU = 30;
            break;
            label457: this.yHV = 30;
            break label130;
            label466: this.xCD = 40;
            break label145;
            label475: bool = false;
            break label294;
          }
        case 2:
        }
        if (i < 2);
        for (long l = 800L + l; ; l = ()((Math.abs(i - k * 0.5D - 5.0D) / (k * 3) + 0.01D) * 1000.0D) + l)
          break;
        label575: if (this.yHT != null)
        {
          localObject = this.yHT.iterator();
          while (((Iterator)localObject).hasNext())
          {
            paramd = (View)((Iterator)localObject).next();
            if ((paramd != null) && ((paramd.getAnimation() instanceof ChattingAnimFrame.c)))
              ChattingAnimFrame.c.a((ChattingAnimFrame.c)paramd.getAnimation());
          }
        }
        AppMethodBeat.o(30521);
      }
    }
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(30519);
    super.onFinishInflate();
    this.aKv = getMeasuredHeight();
    this.aKu = getMeasuredWidth();
    ab.d("MicroMsg.ChattingAnimFrame", "onFinishInflate width:%d height:%d", new Object[] { Integer.valueOf(this.aKu), Integer.valueOf(this.aKv) });
    AppMethodBeat.o(30519);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(30520);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.aKv = (paramInt4 - paramInt2);
    this.aKu = (paramInt3 - paramInt1);
    if (this.aKv < this.mScreenHeight)
      this.yHW = true;
    for (this.yHX = (this.mScreenHeight - this.aKv); ; this.yHX = 0)
    {
      ab.d("MicroMsg.ChattingAnimFrame", "onLayout width:%d height:%d isKeyBordUp:%b keyBordHeight:%d", new Object[] { Integer.valueOf(this.aKu), Integer.valueOf(this.aKv), Boolean.valueOf(this.yHW), Integer.valueOf(this.yHX) });
      AppMethodBeat.o(30520);
      return;
      this.yHW = false;
    }
  }

  public final void stop()
  {
    AppMethodBeat.i(30523);
    Iterator localIterator = this.yHT.iterator();
    while (localIterator.hasNext())
    {
      MMAnimateView localMMAnimateView = (MMAnimateView)localIterator.next();
      localMMAnimateView.clearAnimation();
      localMMAnimateView.recycle();
    }
    removeAllViews();
    AppMethodBeat.o(30523);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChattingAnimFrame
 * JD-Core Version:    0.6.2
 */
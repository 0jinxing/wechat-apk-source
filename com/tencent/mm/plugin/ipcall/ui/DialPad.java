package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.content.res.Resources;
import android.media.AudioManager;
import android.media.ToneGenerator;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.g;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.voip.video.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DialPad extends RelativeLayout
  implements View.OnClickListener, View.OnLongClickListener
{
  private static final String[] nzK = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#" };
  private static final String[] nzL = { "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ", "", "+", "" };
  private boolean nzJ;
  private Map<Integer, DialNumberButton> nzM;
  private Map<String, DialNumberButton> nzN;
  private Map<Integer, View> nzO;
  private DialPad.a nzP;

  public DialPad(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(21959);
    this.nzJ = false;
    this.nzM = new HashMap();
    this.nzN = new HashMap();
    this.nzO = new HashMap();
    init();
    AppMethodBeat.o(21959);
  }

  private void a(int paramInt, String paramString1, String paramString2, float paramFloat)
  {
    AppMethodBeat.i(21961);
    DialNumberButton localDialNumberButton = (DialNumberButton)findViewById(paramInt);
    localDialNumberButton.eK(paramString1, paramString2);
    localDialNumberButton.setNumberTextSize$255e752(paramFloat);
    localDialNumberButton.setOnClickListener(this);
    localDialNumberButton.setOnLongClickListener(this);
    localDialNumberButton.setInTalkUIMode(this.nzJ);
    this.nzM.put(Integer.valueOf(paramInt), localDialNumberButton);
    this.nzN.put(paramString1, localDialNumberButton);
    AppMethodBeat.o(21961);
  }

  private void init()
  {
    AppMethodBeat.i(21960);
    LayoutInflater.from(getContext()).inflate(2130969287, this);
    float f1 = getContext().getResources().getDimensionPixelSize(2131427349);
    float f2 = getContext().getResources().getDimensionPixelSize(2131427351);
    float f3 = getContext().getResources().getDimensionPixelSize(2131427350);
    a(2131823291, nzK[0], nzL[0], f1);
    a(2131823292, nzK[1], nzL[1], f1);
    a(2131823293, nzK[2], nzL[2], f1);
    a(2131823295, nzK[3], nzL[3], f1);
    a(2131823296, nzK[4], nzL[4], f1);
    a(2131823297, nzK[5], nzL[5], f1);
    a(2131823299, nzK[6], nzL[6], f1);
    a(2131823300, nzK[7], nzL[7], f1);
    a(2131823301, nzK[8], nzL[8], f1);
    a(2131823303, nzK[9], nzL[9], f3);
    a(2131823304, nzK[10], nzL[10], f1);
    a(2131823305, nzK[11], nzL[11], f2);
    this.nzO.put(Integer.valueOf(2131823285), findViewById(2131823285));
    this.nzO.put(Integer.valueOf(2131823286), findViewById(2131823286));
    this.nzO.put(Integer.valueOf(2131823287), findViewById(2131823287));
    this.nzO.put(Integer.valueOf(2131823288), findViewById(2131823288));
    this.nzO.put(Integer.valueOf(2131823289), findViewById(2131823289));
    Iterator localIterator = this.nzO.values().iterator();
    while (localIterator.hasNext())
    {
      View localView = (View)localIterator.next();
      if (this.nzJ)
        localView.setBackgroundDrawable(getResources().getDrawable(2131690562));
      else
        localView.setBackgroundDrawable(getResources().getDrawable(2131689947));
    }
    setClipToPadding(false);
    setClipChildren(false);
    AppMethodBeat.o(21960);
  }

  public void onClick(View arg1)
  {
    AppMethodBeat.i(21963);
    String str1;
    String str2;
    d locald;
    int i;
    Object localObject2;
    if (this.nzM.containsKey(Integer.valueOf(???.getId())))
    {
      ??? = (DialNumberButton)this.nzM.get(Integer.valueOf(???.getId()));
      str1 = ???.getNumberText();
      str2 = ???.getOtherText();
      locald = i.bHB();
      i = d.acb(str1);
      if ((i != -1) && (d.cLH()))
      {
        localObject2 = g.KK().eoY;
        ??? = (View)localObject2;
        if (localObject2 == null)
          ??? = (AudioManager)d.mContext.getSystemService("audio");
        int j = ???.getRingerMode();
        if ((j != 0) && (j != 1))
          break label161;
      }
      if (this.nzP != null)
      {
        localObject2 = this.nzP;
        if (bo.isNullOrNil(str1))
          break label212;
      }
    }
    label161: label212: for (??? = str1; ; ??? = str2)
    {
      while (true)
      {
        ((DialPad.a)localObject2).OX(???);
        AppMethodBeat.o(21963);
        return;
        synchronized (locald.sZS)
        {
          if (locald.sZT != null)
            break;
        }
      }
      locald.sZT.startTone(i, 250);
      break;
    }
  }

  public boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(21964);
    boolean bool;
    if (this.nzM.containsKey(Integer.valueOf(paramView.getId())))
    {
      paramView = (DialNumberButton)this.nzM.get(Integer.valueOf(paramView.getId()));
      String str = paramView.getNumberText();
      paramView = paramView.getOtherText();
      if (this.nzP != null)
      {
        DialPad.a locala = this.nzP;
        if (!bo.isNullOrNil(str))
          paramView = str;
        locala.OY(paramView);
      }
      bool = true;
      AppMethodBeat.o(21964);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(21964);
    }
  }

  public void onViewAdded(View paramView)
  {
    AppMethodBeat.i(21965);
    ab.i("MicroMsg.DialPad", "onViewAdded, class: %s", new Object[] { paramView.getClass().getSimpleName() });
    AppMethodBeat.o(21965);
  }

  public void onViewRemoved(View paramView)
  {
    AppMethodBeat.i(21966);
    ab.i("MicroMsg.DialPad", "onViewRemoved, class: %s", new Object[] { paramView.getClass().getSimpleName() });
    AppMethodBeat.o(21966);
  }

  public void setDialButtonClickListener(DialPad.a parama)
  {
    this.nzP = parama;
  }

  public void setTalkUIMode(boolean paramBoolean)
  {
    AppMethodBeat.i(21962);
    this.nzJ = paramBoolean;
    Object localObject = this.nzM.values().iterator();
    while (((Iterator)localObject).hasNext())
      ((DialNumberButton)((Iterator)localObject).next()).setInTalkUIMode(paramBoolean);
    Iterator localIterator = this.nzO.values().iterator();
    while (localIterator.hasNext())
    {
      localObject = (View)localIterator.next();
      if (this.nzJ)
        ((View)localObject).setBackgroundDrawable(getResources().getDrawable(2131690562));
      else
        ((View)localObject).setBackgroundDrawable(getResources().getDrawable(2131689947));
    }
    AppMethodBeat.o(21962);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.DialPad
 * JD-Core Version:    0.6.2
 */
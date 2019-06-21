package com.tencent.mm.plugin.wenote.model.nativenote.manager;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.Editable;
import android.text.Spannable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View.OnKeyListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.gh;
import com.tencent.mm.g.a.gh.a;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.g;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.l;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.t;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.u;
import com.tencent.mm.pluginsdk.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.ae;
import java.util.ArrayList;
import java.util.Iterator;

public final class k
  implements com.tencent.mm.plugin.wenote.model.nativenote.b.c
{
  private static DisplayMetrics aDu;
  public static int mScreenHeight;
  public static int mScreenWidth;
  private static int uQA = -1;
  public static k uQx = null;
  public static int uQy = -1;
  public int acV;
  public long cvv;
  public int iJp;
  public long uQB;
  public String uQC;
  public com.tencent.mm.plugin.wenote.model.nativenote.b.b uQD;
  private boolean uQE;
  public int uQF;
  public String uQG;
  public long uQH;
  public int uQI;
  public boolean uQJ;
  private View.OnKeyListener uQK;
  public final ap uQL;
  private transient ArrayList<WXRTEditText> uQv;
  public com.tencent.mm.plugin.wenote.ui.nativenote.a uQw;
  private int uQz;

  public k(com.tencent.mm.plugin.wenote.ui.nativenote.a parama)
  {
    AppMethodBeat.i(26833);
    this.uQB = -1L;
    this.uQC = "";
    this.cvv = -1L;
    this.uQD = null;
    this.uQE = false;
    this.uQF = -1;
    this.uQG = null;
    this.uQH = -1L;
    this.uQI = 0;
    this.uQJ = false;
    this.uQK = new k.1(this);
    this.uQL = new ap(new k.2(this), true);
    this.uQv = new ArrayList();
    this.uQw = parama;
    uQx = this;
    this.acV = f.de(parama.dfO());
    this.iJp = ae.hA(parama.dfO());
    int[] arrayOfInt = com.tencent.mm.compatible.util.j.db(parama.dfO());
    mScreenHeight = arrayOfInt[1];
    mScreenWidth = arrayOfInt[0];
    aDu = parama.dfO().getResources().getDisplayMetrics();
    this.uQz = (mScreenHeight - this.acV - this.iJp - (int)aU(8.0F));
    this.uQC = c.dem().deu();
    com.tencent.mm.plugin.wenote.model.nativenote.spans.m.uSe = 0.0F;
    AppMethodBeat.o(26833);
  }

  public static float aU(float paramFloat)
  {
    AppMethodBeat.i(26844);
    paramFloat = TypedValue.applyDimension(1, paramFloat, aDu);
    AppMethodBeat.o(26844);
    return paramFloat;
  }

  private void bL(String paramString, boolean paramBoolean)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(26845);
        gh localgh = new com/tencent/mm/g/a/gh;
        localgh.<init>();
        localgh.cAH.type = 19;
        localgh.cAH.cvC = c.dem().ahe(paramString);
        if (localgh.cAH.cvC == null)
        {
          ab.e("MicroMsg.Note.WXRTManager", "updateNoteInfoStorage error, favProtoItem is null");
          AppMethodBeat.o(26845);
          return;
        }
        localgh.cAH.title = paramString;
        localgh.cAH.cvv = this.cvv;
        paramString = localgh.cAH;
        if (paramBoolean)
        {
          i = 1;
          paramString.cAO = i;
          localgh.cAH.desc = "fav_update_note_storage";
          com.tencent.mm.sdk.b.a.xxA.m(localgh);
          if (paramBoolean)
          {
            this.uQF = localgh.cAH.cAK.getIntExtra("fav_note_item_status", -1);
            this.uQG = localgh.cAH.cAK.getStringExtra("fav_note_xml");
            this.uQH = localgh.cAH.cAK.getLongExtra("fav_note_item_updatetime", -1L);
          }
          AppMethodBeat.o(26845);
          continue;
        }
      }
      finally
      {
      }
      int i = 0;
    }
  }

  public static k deT()
  {
    return uQx;
  }

  private void deU()
  {
    AppMethodBeat.i(26846);
    if ((this.uQB < 0L) && (this.cvv > 0L))
    {
      this.uQL.ae(60000L, 60000L);
      this.uQB = bo.yz();
      this.uQC = c.dem().deu();
    }
    AppMethodBeat.o(26846);
  }

  public static void deX()
  {
    AppMethodBeat.i(26850);
    if (uQx != null)
      uQx.uQw.dfP().oj(true);
    AppMethodBeat.o(26850);
  }

  public final void Kb(int paramInt)
  {
    AppMethodBeat.i(26838);
    this.uQw.dfP().af(paramInt, 0L);
    AppMethodBeat.o(26838);
  }

  public final void a(WXRTEditText paramWXRTEditText, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(26840);
    if ((this.uQI != 2) || (!this.uQJ))
    {
      AppMethodBeat.o(26840);
      return;
    }
    this.uQw.dfP().gE(paramInt1, paramInt2);
    label71: boolean bool5;
    boolean bool6;
    boolean bool7;
    boolean bool8;
    if (paramWXRTEditText.getEditTextType() == 0)
    {
      Iterator localIterator = u.uSE.iterator();
      boolean bool1 = false;
      boolean bool2 = false;
      boolean bool3 = false;
      boolean bool4 = false;
      t localt;
      while (true)
      {
        bool5 = bool1;
        bool6 = bool2;
        bool7 = bool3;
        bool8 = bool4;
        if (!localIterator.hasNext())
          break label186;
        localt = (t)localIterator.next();
        if (!localt.s(paramWXRTEditText))
          break label239;
        if ((localt instanceof com.tencent.mm.plugin.wenote.model.nativenote.spans.b))
        {
          bool4 = true;
        }
        else if ((localt instanceof com.tencent.mm.plugin.wenote.model.nativenote.spans.c))
        {
          bool3 = true;
        }
        else
        {
          if (!(localt instanceof l))
            break;
          bool2 = true;
        }
      }
      if (!(localt instanceof com.tencent.mm.plugin.wenote.model.nativenote.spans.j))
        break label239;
      bool1 = true;
    }
    label186: label239: 
    while (true)
    {
      break label71;
      bool5 = false;
      bool6 = false;
      bool7 = false;
      bool8 = false;
      this.uQD.ok(bool8);
      this.uQD.ol(bool7);
      this.uQD.om(bool6);
      this.uQD.on(bool5);
      AppMethodBeat.o(26840);
      break;
    }
  }

  public final void a(WXRTEditText paramWXRTEditText, Spannable paramSpannable1, Spannable paramSpannable2, int paramInt)
  {
    AppMethodBeat.i(26841);
    String str = paramWXRTEditText.a(i.uQr);
    com.tencent.mm.plugin.wenote.model.a.c localc;
    int i;
    int j;
    if (paramWXRTEditText.getEditTextType() == 0)
    {
      localc = c.dem().Ke(paramWXRTEditText.getRecyclerItemPosition());
      if ((localc != null) && (localc.getType() == 1))
        if (paramSpannable1 == null)
        {
          i = 0;
          if (paramSpannable2 != null)
            break label128;
          j = 0;
          label62: if (!c.dem().gF(j - i, 0))
            break label140;
          this.uQw.dfP().ddW();
          this.uQw.dfP().JX(paramWXRTEditText.getRecyclerItemPosition());
          AppMethodBeat.o(26841);
        }
    }
    while (true)
    {
      return;
      i = com.tencent.mm.plugin.wenote.b.c.ahm(paramSpannable1.toString());
      break;
      label128: j = com.tencent.mm.plugin.wenote.b.c.ahm(paramSpannable2.toString());
      break label62;
      label140: c.dem().dep();
      ((com.tencent.mm.plugin.wenote.model.a.i)localc).uNV = paramInt;
      ((com.tencent.mm.plugin.wenote.model.a.i)localc).content = str;
      ((com.tencent.mm.plugin.wenote.model.a.i)localc).uNT = true;
      localc.uNZ = false;
      paramWXRTEditText = c.dem();
      paramWXRTEditText.uPd = (j - i + paramWXRTEditText.uPd);
      AppMethodBeat.o(26841);
      continue;
      paramWXRTEditText.setText("");
      if (!bo.isNullOrNil(str))
        break label231;
      AppMethodBeat.o(26841);
    }
    label231: paramSpannable2 = new com.tencent.mm.plugin.wenote.model.a.i();
    if (str.equals("<br/>"));
    for (paramSpannable1 = ""; ; paramSpannable1 = str)
    {
      paramSpannable2.content = paramSpannable1;
      paramInt = c.dem().a(paramSpannable2, paramWXRTEditText, true, false, false);
      c.dem().gG(paramInt - 1, paramInt + 1);
      AppMethodBeat.o(26841);
      break;
    }
  }

  public final void a(WXRTEditText paramWXRTEditText, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(26839);
    if (paramBoolean);
    try
    {
      deU();
      this.uQw.dfP().a(paramWXRTEditText, paramBoolean, paramInt);
      return;
    }
    finally
    {
      AppMethodBeat.o(26839);
    }
    throw paramWXRTEditText;
  }

  public final void b(WXRTEditText paramWXRTEditText)
  {
    AppMethodBeat.i(26843);
    this.uQw.dfP().a(paramWXRTEditText);
    AppMethodBeat.o(26843);
  }

  public final <V, C extends g<V>> void b(t<V, C> paramt, V paramV)
  {
    AppMethodBeat.i(26849);
    WXRTEditText localWXRTEditText = deS();
    if (localWXRTEditText != null)
      if (localWXRTEditText.getEditTextType() == 0)
      {
        int i = localWXRTEditText.getSelection().aqm;
        int j = localWXRTEditText.getText().length();
        if (((paramV instanceof Boolean)) && (((Boolean)paramV).booleanValue()) && (i == j))
        {
          localWXRTEditText.deL();
          localWXRTEditText.getText().append("\n");
          localWXRTEditText.deM();
          localWXRTEditText.setSelection(i);
        }
        localWXRTEditText.a(paramt, paramV);
        AppMethodBeat.o(26849);
      }
    while (true)
    {
      return;
      localWXRTEditText.uQc = true;
      localWXRTEditText.uOd = paramt.dfy();
      localWXRTEditText.getText().append("\n");
      AppMethodBeat.o(26849);
    }
  }

  public final WXRTEditText deS()
  {
    AppMethodBeat.i(26835);
    Object localObject1 = c.dem();
    ArrayList localArrayList = this.uQv;
    if (localArrayList != null)
      localArrayList.clear();
    while (true)
    {
      com.tencent.mm.plugin.wenote.model.a.c localc;
      try
      {
        if (((c)localObject1).iPr == null)
        {
          if (this.uQv != null)
            break label155;
          AppMethodBeat.o(26835);
          localObject1 = null;
          return localObject1;
        }
        Iterator localIterator2 = ((c)localObject1).iPr.iterator();
        if (!localIterator2.hasNext())
          break label150;
        localc = (com.tencent.mm.plugin.wenote.model.a.c)localIterator2.next();
        if (localc.uNY != null)
        {
          localArrayList.add(localc.uNY);
          continue;
        }
      }
      finally
      {
        AppMethodBeat.o(26835);
      }
      if ((localc.uNW != null) && (localc.uNX != null))
      {
        localObject2.add(localc.uNW);
        localObject2.add(localc.uNX);
        continue;
        label150: continue;
        label155: Iterator localIterator1 = this.uQv.iterator();
        while (true)
          if (localIterator1.hasNext())
          {
            localObject1 = (WXRTEditText)localIterator1.next();
            if (((WXRTEditText)localObject1).hasFocus())
            {
              AppMethodBeat.o(26835);
              break;
            }
          }
        AppMethodBeat.o(26835);
        localObject1 = null;
      }
    }
  }

  public final void deV()
  {
    AppMethodBeat.i(26847);
    if ((this.cvv > 0L) && (this.uQB > 0L))
    {
      String str = c.dem().deu();
      if (!str.equals(this.uQC))
      {
        this.uQC = str;
        if (!this.uQE)
        {
          this.uQE = true;
          bL(this.uQC, true);
          AppMethodBeat.o(26847);
        }
      }
    }
    while (true)
    {
      return;
      bL(this.uQC, false);
      AppMethodBeat.o(26847);
    }
  }

  public final WXRTEditText deW()
  {
    AppMethodBeat.i(26848);
    WXRTEditText localWXRTEditText = deS();
    if ((localWXRTEditText == null) && (this.uQv.size() > 0))
    {
      localWXRTEditText = (WXRTEditText)this.uQv.get(this.uQv.size() - 1);
      AppMethodBeat.o(26848);
    }
    while (true)
    {
      return localWXRTEditText;
      AppMethodBeat.o(26848);
    }
  }

  public final void deg()
  {
    AppMethodBeat.i(26837);
    this.uQw.dfP().deg();
    deU();
    AppMethodBeat.o(26837);
  }

  public final void dei()
  {
    AppMethodBeat.i(26842);
    this.uQw.dfP().ddU();
    AppMethodBeat.o(26842);
  }

  public final void g(boolean paramBoolean, long paramLong)
  {
    AppMethodBeat.i(26836);
    this.uQw.dfP().g(paramBoolean, paramLong);
    AppMethodBeat.o(26836);
  }

  public final void q(WXRTEditText paramWXRTEditText)
  {
    AppMethodBeat.i(26834);
    if (paramWXRTEditText.uPQ == 0)
      paramWXRTEditText.setTextSize(0, com.tencent.mm.bz.a.al(paramWXRTEditText.getContext(), 2131427813));
    b.setTextSize(paramWXRTEditText.getTextSize());
    paramWXRTEditText.uPG = this;
    paramWXRTEditText.setRichTextEditing(null);
    paramWXRTEditText.setOnKeyListener(this.uQK);
    AppMethodBeat.o(26834);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.manager.k
 * JD-Core Version:    0.6.2
 */
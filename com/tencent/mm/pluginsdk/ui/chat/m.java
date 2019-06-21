package com.tencent.mm.pluginsdk.ui.chat;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.PluginEmoji;
import com.tencent.mm.pluginsdk.a.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.base.HorizontalListView;
import com.tencent.mm.ui.base.HorizontalListView.a;
import com.tencent.mm.ui.base.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public final class m
{
  private View WL;
  private AdapterView.OnItemClickListener arw;
  private int jlr;
  ArrayList<EmojiInfo> lbH;
  Context mContext;
  ak mHandler;
  m.a vnn;
  int voC;
  int voD;
  o voE;
  View voF;
  j voG;
  String voH;
  public String voI;
  public boolean voJ;
  private HorizontalListView voK;
  m.b voL;
  private boolean voM;
  private Comparator voN;
  private HorizontalListView.a voO;

  public m(Context paramContext)
  {
    AppMethodBeat.i(62465);
    this.voI = "";
    this.voJ = true;
    this.lbH = new ArrayList();
    this.jlr = 3;
    this.voM = true;
    this.mHandler = new m.1(this);
    this.voN = new m.2(this);
    this.arw = new m.3(this);
    this.voO = new m.4(this);
    this.mContext = paramContext;
    this.WL = View.inflate(this.mContext, 2130969024, null);
    this.voK = ((HorizontalListView)this.WL.findViewById(2131822440));
    this.voL = new m.b(this);
    this.voK.setAdapter(this.voL);
    this.voK.setOnItemClickListener(this.arw);
    this.voK.setOnItemSelectedListener(new m.5(this));
    this.voK.setDispatchTouchListener(this.voO);
    this.voC = a.al(this.mContext, 2131428377);
    this.voD = a.al(this.mContext, 2131427796);
    this.voE = new o(this.WL, this.voC + this.voD * 2, this.voC + this.voD * 2, true);
    this.voE.setBackgroundDrawable(new ColorDrawable(0));
    this.voE.setOutsideTouchable(true);
    this.voE.setFocusable(false);
    AppMethodBeat.o(62465);
  }

  public final boolean cM(String paramString)
  {
    AppMethodBeat.i(62468);
    try
    {
      if (!bo.isNullOrNil(paramString))
      {
        localObject1 = ((PluginEmoji)g.M(PluginEmoji.class)).getEmojiMgr().Jj(paramString);
        if ((localObject1 != null) && (!((ArrayList)localObject1).isEmpty()))
        {
          this.voH = paramString.replaceAll(",", "");
          if ((localObject1 == null) || (((ArrayList)localObject1).isEmpty()))
            AppMethodBeat.o(62468);
          for (bool = false; ; bool = false)
          {
            return bool;
            localObject2 = new java/util/ArrayList;
            ((ArrayList)localObject2).<init>();
            this.lbH.clear();
            int i = ((ArrayList)localObject1).size();
            for (int j = 0; (j < i) && (j < 100); j++)
            {
              paramString = ((PluginEmoji)g.M(PluginEmoji.class)).getEmojiMgr().Jd((String)((ArrayList)localObject1).get(j));
              if (paramString != null)
                ((ArrayList)localObject2).add(paramString);
            }
            if (!((ArrayList)localObject2).isEmpty())
              break;
            ab.i("MicroMsg.emoji.SuggestEmoticonBubble", "sorEmojiList return. empty list.");
            AppMethodBeat.o(62468);
          }
          if (!this.voM)
            break label295;
          paramString = (EmojiInfo)Collections.max((Collection)localObject2, this.voN);
          this.lbH.add(paramString);
          localObject2 = ((ArrayList)localObject2).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localObject1 = (EmojiInfo)((Iterator)localObject2).next();
            if ((!((EmojiInfo)localObject1).cJ(paramString)) && (!this.lbH.contains(localObject1)))
              this.lbH.add(localObject1);
          }
        }
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        Object localObject2;
        ab.e("MicroMsg.emoji.SuggestEmoticonBubble", bo.l(paramString));
        this.voH = "";
        AppMethodBeat.o(62468);
        boolean bool = false;
        continue;
        label295: Object localObject1 = ((ArrayList)localObject2).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          paramString = (EmojiInfo)((Iterator)localObject1).next();
          if (!this.lbH.contains(paramString))
            this.lbH.add(paramString);
        }
        if ((this.lbH == null) || (this.lbH.isEmpty()))
        {
          AppMethodBeat.o(62468);
          bool = false;
        }
        else
        {
          bool = true;
          AppMethodBeat.o(62468);
        }
      }
    }
  }

  public final void dkL()
  {
    AppMethodBeat.i(62466);
    if (this.voF != null)
    {
      int[] arrayOfInt = new int[2];
      this.voF.getLocationInWindow(arrayOfInt);
      int i = arrayOfInt[0];
      int j = (this.voE.getWidth() - this.voF.getWidth()) / 2;
      int k = arrayOfInt[1];
      int m = this.voE.getHeight();
      this.voE.showAtLocation(this.voF, 0, i - j, k - m);
    }
    AppMethodBeat.o(62466);
  }

  public final void hide()
  {
    AppMethodBeat.i(62467);
    if (this.voE == null)
      AppMethodBeat.o(62467);
    while (true)
    {
      return;
      if (this.voE.isShowing())
        this.voE.dismiss();
      this.mHandler.removeCallbacksAndMessages(null);
      AppMethodBeat.o(62467);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.m
 * JD-Core Version:    0.6.2
 */
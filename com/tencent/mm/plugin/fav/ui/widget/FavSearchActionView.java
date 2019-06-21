package com.tencent.mm.plugin.fav.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.List;

public class FavSearchActionView extends LinearLayout
{
  private ImageView lnh;
  public FavTagPanel mjS;
  public List<Integer> mlj;
  private ImageButton mpR;
  public List<String> mpS;
  public List<String> mpT;
  public FavSearchActionView.a mpU;

  public FavSearchActionView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(74689);
    this.mlj = new LinkedList();
    this.mpS = new LinkedList();
    this.mpT = new LinkedList();
    AppMethodBeat.o(74689);
  }

  private static String M(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(74695);
    if (paramContext == null)
    {
      paramContext = "";
      AppMethodBeat.o(74695);
    }
    while (true)
    {
      return paramContext;
      switch (paramInt)
      {
      case 4:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 16:
      case 19:
      case 20:
      default:
        paramContext = "";
        AppMethodBeat.o(74695);
        break;
      case 21:
        paramContext = paramContext.getString(2131299741);
        AppMethodBeat.o(74695);
        break;
      case 5:
        paramContext = paramContext.getString(2131299746);
        AppMethodBeat.o(74695);
        break;
      case 8:
        paramContext = paramContext.getString(2131299739);
        AppMethodBeat.o(74695);
        break;
      case 7:
        paramContext = paramContext.getString(2131299743);
        AppMethodBeat.o(74695);
        break;
      case 17:
        paramContext = paramContext.getString(2131299745);
        AppMethodBeat.o(74695);
        break;
      case 3:
        paramContext = paramContext.getString(2131299748);
        AppMethodBeat.o(74695);
        break;
      case 18:
        paramContext = paramContext.getString(2131299744);
        AppMethodBeat.o(74695);
        break;
      case 6:
        paramContext = paramContext.getString(2131299742);
        AppMethodBeat.o(74695);
      }
    }
  }

  public static Integer ap(Context paramContext, String paramString)
  {
    AppMethodBeat.i(74696);
    if (paramContext == null)
    {
      paramContext = Integer.valueOf(-1);
      AppMethodBeat.o(74696);
    }
    while (true)
    {
      return paramContext;
      if (paramContext.getString(2131299741).equals(paramString))
      {
        paramContext = Integer.valueOf(21);
        AppMethodBeat.o(74696);
      }
      else if (paramContext.getString(2131299746).equals(paramString))
      {
        paramContext = Integer.valueOf(5);
        AppMethodBeat.o(74696);
      }
      else if (paramContext.getString(2131299739).equals(paramString))
      {
        paramContext = Integer.valueOf(8);
        AppMethodBeat.o(74696);
      }
      else if (paramContext.getString(2131299743).equals(paramString))
      {
        paramContext = Integer.valueOf(7);
        AppMethodBeat.o(74696);
      }
      else if (paramContext.getString(2131299745).equals(paramString))
      {
        paramContext = Integer.valueOf(17);
        AppMethodBeat.o(74696);
      }
      else if (paramContext.getString(2131299748).equals(paramString))
      {
        paramContext = Integer.valueOf(3);
        AppMethodBeat.o(74696);
      }
      else if (paramContext.getString(2131299744).equals(paramString))
      {
        paramContext = Integer.valueOf(18);
        AppMethodBeat.o(74696);
      }
      else if (paramContext.getString(2131299742).equals(paramString))
      {
        paramContext = Integer.valueOf(6);
        AppMethodBeat.o(74696);
      }
      else
      {
        paramContext = Integer.valueOf(-1);
        AppMethodBeat.o(74696);
      }
    }
  }

  private void bwB()
  {
    AppMethodBeat.i(74693);
    if ((this.mlj.isEmpty()) && (this.mpS.isEmpty()))
    {
      this.mjS.setEditHint(getResources().getString(2131297040));
      AppMethodBeat.o(74693);
    }
    while (true)
    {
      return;
      this.mjS.setEditHint("");
      AppMethodBeat.o(74693);
    }
  }

  public final void Mh(String paramString)
  {
    AppMethodBeat.i(74691);
    this.mpT.clear();
    for (paramString : bo.bc(paramString, "").split(" "))
      if (!bo.isNullOrNil(paramString))
        this.mpT.add(paramString);
    AppMethodBeat.o(74691);
  }

  public final void S(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(74694);
    this.mlj.clear();
    this.mlj.add(Integer.valueOf(paramInt));
    if (this.mjS == null)
      AppMethodBeat.o(74694);
    while (true)
    {
      return;
      bwB();
      this.mjS.setType(M(getContext(), paramInt));
      if (this.mpU == null)
      {
        AppMethodBeat.o(74694);
      }
      else
      {
        Mh(this.mjS.getEditText());
        if (paramBoolean)
          this.mpU.a(this.mlj, this.mpT, this.mpS, false);
        h.pYm.e(11126, new Object[] { Integer.valueOf(1) });
        AppMethodBeat.o(74694);
      }
    }
  }

  public List<String> getSearchKeys()
  {
    AppMethodBeat.i(74692);
    if (this.mjS != null)
      Mh(this.mjS.getEditText());
    List localList = this.mpT;
    AppMethodBeat.o(74692);
    return localList;
  }

  public List<String> getSearchTags()
  {
    return this.mpS;
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(74690);
    super.onFinishInflate();
    this.mpR = ((ImageButton)findViewById(2131823967));
    this.mjS = ((FavTagPanel)findViewById(2131823966));
    this.lnh = ((ImageView)findViewById(2131820978));
    if (this.mjS != null)
    {
      this.mjS.setEditTextColor(getResources().getColor(2131689764));
      this.mjS.setTagTipsDrawable(0);
      this.mjS.setTagHighlineBG(0);
      this.mjS.setTagSelectedBG(0);
      this.mjS.setTagSelectedTextColorRes(2131689776);
      this.mjS.setTagNormalBG(0);
      this.mjS.setTagNormalTextColorRes(2131690691);
      this.mjS.setEditHint(getResources().getString(2131297040));
      this.mjS.qe(true);
      this.mjS.yxn = false;
      this.mjS.yxo = true;
      this.mjS.setCallBack(new FavSearchActionView.1(this));
    }
    if (this.mpR != null)
      this.mpR.setOnClickListener(new FavSearchActionView.2(this));
    AppMethodBeat.o(74690);
  }

  public void setOnSearchChangedListener(FavSearchActionView.a parama)
  {
    this.mpU = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.widget.FavSearchActionView
 * JD-Core Version:    0.6.2
 */
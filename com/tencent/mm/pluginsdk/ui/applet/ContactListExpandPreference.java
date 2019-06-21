package com.tencent.mm.pluginsdk.ui.applet;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.pluginsdk.ui.d;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import java.util.ArrayList;
import java.util.List;

public class ContactListExpandPreference extends Preference
{
  private int vlc;
  public i vld;
  public k vle;

  public ContactListExpandPreference(Context paramContext, int paramInt)
  {
    super(paramContext);
    AppMethodBeat.i(79763);
    this.vlc = -1;
    if (paramInt == 0)
      djE();
    while (true)
    {
      setLayoutResource(2130970141);
      AppMethodBeat.o(79763);
      return;
      if (paramInt == 1)
      {
        this.vlc = 1;
        this.vle = new k();
      }
    }
  }

  public ContactListExpandPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(79764);
    this.vlc = -1;
    djE();
    setLayoutResource(2130970141);
    AppMethodBeat.o(79764);
  }

  public ContactListExpandPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(79765);
    this.vlc = -1;
    djE();
    setLayoutResource(2130970141);
    AppMethodBeat.o(79765);
  }

  private void djE()
  {
    AppMethodBeat.i(79766);
    this.vlc = 0;
    this.vld = new i(this.mContext);
    AppMethodBeat.o(79766);
  }

  public final boolean KU(int paramInt)
  {
    AppMethodBeat.i(79772);
    boolean bool;
    if (this.vld != null)
    {
      bool = this.vld.vkt.KU(paramInt);
      AppMethodBeat.o(79772);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(79772);
    }
  }

  public final boolean KW(int paramInt)
  {
    AppMethodBeat.i(79773);
    boolean bool;
    if (this.vld != null)
    {
      bool = this.vld.vkt.KW(paramInt);
      AppMethodBeat.o(79773);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(79773);
    }
  }

  public final String KX(int paramInt)
  {
    AppMethodBeat.i(79775);
    String str;
    if ((this.vld != null) && (this.vld.vkt.KW(paramInt)))
    {
      str = ((ad)this.vld.vkt.getItem(paramInt)).field_username;
      AppMethodBeat.o(79775);
    }
    while (true)
    {
      return str;
      str = "";
      AppMethodBeat.o(79775);
    }
  }

  public final String KY(int paramInt)
  {
    AppMethodBeat.i(79776);
    String str;
    if ((this.vld != null) && (this.vld.vkt.KW(paramInt)))
    {
      str = ((ad)this.vld.vkt.getItem(paramInt)).field_nickname;
      AppMethodBeat.o(79776);
    }
    while (true)
    {
      return str;
      str = "";
      AppMethodBeat.o(79776);
    }
  }

  public final String KZ(int paramInt)
  {
    AppMethodBeat.i(79777);
    String str;
    if ((this.vld != null) && (this.vld.vkt.KW(paramInt)))
    {
      str = ((ad)this.vld.vkt.getItem(paramInt)).field_conRemark;
      AppMethodBeat.o(79777);
    }
    while (true)
    {
      return str;
      str = "";
      AppMethodBeat.o(79777);
    }
  }

  public final void a(ContactListExpandPreference.a parama)
  {
    if (this.vld != null)
      this.vld.rPU = parama;
  }

  public final void a(k.b paramb)
  {
    if (this.vld != null)
      this.vld.vku = paramb;
  }

  public final void a(d paramd)
  {
    if (this.vld != null)
      this.vld.vkt.vkK = paramd;
  }

  public final void a(f paramf, String paramString)
  {
    AppMethodBeat.i(79768);
    if (this.vld != null)
      this.vld.a(paramf, paramString);
    AppMethodBeat.o(79768);
  }

  public final void ag(ArrayList<ad> paramArrayList)
  {
    AppMethodBeat.i(79771);
    if (this.vld != null)
      this.vld.ag(paramArrayList);
    AppMethodBeat.o(79771);
  }

  public final void ajF(String paramString)
  {
    if (this.vld != null)
      this.vld.vkt.vkR = paramString;
  }

  public final void ci(List<String> paramList)
  {
    AppMethodBeat.i(79781);
    if (this.vld != null)
      this.vld.vkt.ci(paramList);
    AppMethodBeat.o(79781);
  }

  public final void djD()
  {
    AppMethodBeat.i(79778);
    if (this.vld != null)
      this.vld.vkt.djD();
    AppMethodBeat.o(79778);
  }

  public final void djF()
  {
    if (this.vld != null)
      this.vld.vkt.vkV = false;
  }

  public final ContactListExpandPreference djG()
  {
    if (this.vld != null)
      this.vld.vkt.vkN = false;
    return this;
  }

  public final void djz()
  {
    AppMethodBeat.i(79779);
    if (this.vld != null)
      this.vld.djz();
    AppMethodBeat.o(79779);
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(79774);
    Object localObject;
    if ((this.vld != null) && (this.vld.vkt.KW(paramInt)))
    {
      localObject = this.vld.vkt.getItem(paramInt);
      AppMethodBeat.o(79774);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(79774);
    }
  }

  public final void notifyChanged()
  {
    AppMethodBeat.i(79769);
    if (this.vld != null)
      this.vld.aPw();
    AppMethodBeat.o(79769);
  }

  public final void oB(boolean paramBoolean)
  {
    if (this.vld != null)
      this.vld.vkt.vkG = paramBoolean;
  }

  public final void oC(boolean paramBoolean)
  {
    if (this.vld != null)
      this.vld.vkt.vkF = paramBoolean;
  }

  public final ContactListExpandPreference oD(boolean paramBoolean)
  {
    if (this.vld != null)
      this.vld.vkt.vkM = paramBoolean;
    return this;
  }

  public final ContactListExpandPreference oE(boolean paramBoolean)
  {
    if (this.vld != null)
      this.vld.vkt.vkL = paramBoolean;
    return this;
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(79767);
    ViewGroup localViewGroup;
    if (this.vlc == 1)
    {
      k localk = this.vle;
      label69: int i;
      label146: label191: View localView;
      label228: LinearLayout.LayoutParams localLayoutParams;
      int j;
      if (paramView.getId() == 2131826022)
      {
        localViewGroup = (ViewGroup)paramView;
        if (localk.row != 0)
          break label421;
        localViewGroup.setPadding(localViewGroup.getPaddingLeft(), localViewGroup.getResources().getDimensionPixelSize(2131427785), localViewGroup.getPaddingRight(), localViewGroup.getResources().getDimensionPixelSize(2131427796));
        if (((localk.vkt.vkJ % j.vkC != j.vkC - 1) && (localk.vkt.vkJ % j.vkC != 0)) || (!localk.eic) || (localk.row != localk.vkt.getCount() / j.vkC - 1))
          break label502;
        localViewGroup.setPadding(localViewGroup.getPaddingLeft(), localViewGroup.getPaddingTop(), localViewGroup.getPaddingRight(), 0);
        if (localk.vkt == null)
          break label642;
        localViewGroup.setOnClickListener(localk.pLd);
        if (localViewGroup.getChildCount() > j.vkC)
        {
          localViewGroup.removeViews(0, localViewGroup.getChildCount() - j.vkC);
          localViewGroup.requestLayout();
        }
        i = 0;
        if (i >= localk.vlf)
          break label612;
        if (localViewGroup.getChildAt(i) != null)
          break label576;
        localView = View.inflate(localViewGroup.getContext(), 2130970531, null);
        localViewGroup.addView(localView);
        localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
        localLayoutParams.gravity = 49;
        if (j.vkC != 4)
          break label587;
        j = localViewGroup.getResources().getDimensionPixelSize(2131427812);
        localLayoutParams.setMargins(j, 0, j, 0);
      }
      while (true)
      {
        if ((!localk.vkt.djB()) && (localk.vkt.vkJ == 1))
        {
          j = localViewGroup.getResources().getDimensionPixelSize(2131427510);
          localLayoutParams.setMargins(j, 0, j, 0);
        }
        localView.setLayoutParams(localLayoutParams);
        j = localk.row * localk.vlf + i;
        localk.vkt.getView(j, localView, localViewGroup);
        if (localk.vkz != null)
          localView.setOnClickListener(new k.3(localk, localViewGroup, j));
        if (localk.vlg != null)
          localView.setOnLongClickListener(new k.4(localk, localViewGroup, j));
        i++;
        break label191;
        localViewGroup = (ViewGroup)paramView.findViewById(2131826022);
        break;
        label421: if (localk.row == localk.vkt.getCount() / j.vkC - 1)
        {
          localViewGroup.setPadding(localViewGroup.getPaddingLeft(), localViewGroup.getPaddingTop(), localViewGroup.getPaddingRight(), localViewGroup.getResources().getDimensionPixelSize(2131427785));
          break label69;
        }
        localViewGroup.setPadding(localViewGroup.getPaddingLeft(), localViewGroup.getResources().getDimensionPixelSize(2131427796), localViewGroup.getPaddingRight(), localViewGroup.getResources().getDimensionPixelSize(2131427796));
        break label69;
        label502: if ((localk.eic) || (localk.vkt.vkJ % j.vkC != 0) || (localk.row != localk.vkt.getCount() / j.vkC - 1))
          break label146;
        localViewGroup.setPadding(localViewGroup.getPaddingLeft(), localViewGroup.getPaddingTop(), localViewGroup.getPaddingRight(), (int)localViewGroup.getContext().getResources().getDimension(2131427858));
        break label146;
        label576: localView = localViewGroup.getChildAt(i);
        break label228;
        label587: j = localViewGroup.getResources().getDimensionPixelSize(2131427796);
        localLayoutParams.setMargins(j, 0, j, 0);
      }
      label612: if ((!localk.vkt.djB()) && (localk.vkt.vkJ <= 1))
        break label653;
      ((LinearLayout)localViewGroup).setGravity(17);
    }
    while (true)
    {
      label642: super.onBindView(paramView);
      AppMethodBeat.o(79767);
      return;
      label653: ((LinearLayout)localViewGroup).setGravity(19);
    }
  }

  public final void refresh()
  {
    AppMethodBeat.i(79780);
    if (this.vld != null)
      this.vld.vkt.Kh();
    AppMethodBeat.o(79780);
  }

  public final void u(String paramString, List<String> paramList)
  {
    AppMethodBeat.i(79770);
    if (this.vld != null)
      this.vld.u(paramString, paramList);
    AppMethodBeat.o(79770);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference
 * JD-Core Version:    0.6.2
 */
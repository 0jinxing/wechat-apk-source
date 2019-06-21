package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.tools.q;
import junit.framework.Assert;

public class HelperHeaderPreference extends Preference
{
  private ad ehM;
  private ImageView eks;
  private TextView gKr;
  private TextView gnh;
  private boolean gqJ = false;
  private TextView pnE;
  private HelperHeaderPreference.a pnF;

  public HelperHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public HelperHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private void initView()
  {
    AppMethodBeat.i(23641);
    if ((!this.gqJ) || (this.ehM == null))
    {
      ab.w("MicroMsg.HelperHeaderPreference", "initView : bindView = " + this.gqJ + "contact = " + this.ehM);
      AppMethodBeat.o(23641);
    }
    while (true)
    {
      return;
      pZ(this.ehM.field_username);
      if (this.pnE != null)
        this.pnE.setText(this.ehM.Oi());
      if (this.pnF != null)
      {
        this.pnF.a(this);
        CharSequence localCharSequence = this.pnF.getHint();
        if (localCharSequence != null)
        {
          this.gKr.setText(localCharSequence);
          this.gKr.setVisibility(0);
          AppMethodBeat.o(23641);
        }
        else
        {
          this.gKr.setVisibility(8);
        }
      }
      else
      {
        AppMethodBeat.o(23641);
      }
    }
  }

  private void pZ(String paramString)
  {
    AppMethodBeat.i(23639);
    ab.d("MicroMsg.HelperHeaderPreference", "updateAvatar : user = ".concat(String.valueOf(paramString)));
    if ((this.eks != null) && (this.ehM.field_username.equals(paramString)))
      a.b.b(this.eks, paramString);
    AppMethodBeat.o(23639);
  }

  public final void a(ad paramad, HelperHeaderPreference.a parama)
  {
    AppMethodBeat.i(23642);
    if (paramad != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      this.ehM = paramad;
      this.pnF = parama;
      initView();
      AppMethodBeat.o(23642);
      return;
    }
  }

  public final void jR(boolean paramBoolean)
  {
    AppMethodBeat.i(23640);
    if (this.pnF == null)
      AppMethodBeat.o(23640);
    while (true)
    {
      return;
      if (paramBoolean)
      {
        this.gnh.setTextColor(q.ii(this.mContext));
        this.gnh.setText(2131303211);
        this.gnh.setCompoundDrawablesWithIntrinsicBounds(2130840329, 0, 0, 0);
        AppMethodBeat.o(23640);
      }
      else
      {
        this.gnh.setTextColor(q.ij(this.mContext));
        this.gnh.setText(2131303219);
        this.gnh.setCompoundDrawablesWithIntrinsicBounds(2130840328, 0, 0, 0);
        AppMethodBeat.o(23640);
      }
    }
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(23638);
    this.eks = ((ImageView)paramView.findViewById(2131821459));
    this.gnh = ((TextView)paramView.findViewById(2131822999));
    this.pnE = ((TextView)paramView.findViewById(2131821460));
    this.gKr = ((TextView)paramView.findViewById(2131821461));
    this.gqJ = true;
    initView();
    super.onBindView(paramView);
    AppMethodBeat.o(23638);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.HelperHeaderPreference
 * JD-Core Version:    0.6.2
 */
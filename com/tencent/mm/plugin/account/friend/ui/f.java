package com.tencent.mm.plugin.account.friend.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.ah.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.account.friend.a.ao;
import com.tencent.mm.plugin.account.friend.a.ap;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;

public final class f extends d
{
  private final int Zb;
  private final MMActivity crP;
  private String gtz;
  private d.a gxG;
  boolean gxO;
  private f.a gxP;

  public f(MMActivity paramMMActivity, int paramInt)
  {
    super(paramMMActivity, new ao());
    AppMethodBeat.i(108606);
    this.gxO = false;
    this.gxP = new f.1(this);
    this.crP = paramMMActivity;
    this.Zb = paramInt;
    this.gxO = paramMMActivity.getIntent().getBooleanExtra("qqgroup_sendmessage", false);
    pN(true);
    AppMethodBeat.o(108606);
  }

  private static String b(ao paramao)
  {
    AppMethodBeat.i(108611);
    if (paramao.frS == 123)
    {
      paramao = "#";
      AppMethodBeat.o(108611);
    }
    while (true)
    {
      return paramao;
      paramao = String.valueOf((char)paramao.frS);
      AppMethodBeat.o(108611);
    }
  }

  public final void KC()
  {
    AppMethodBeat.i(108609);
    bIf();
    if (bo.isNullOrNil(this.gtz))
      setCursor(((ap)((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).getQQListStg()).E(this.Zb, this.gxO));
    while (true)
    {
      if ((this.gxG != null) && (this.gtz != null))
        this.gxG.mT(getCursor().getCount());
      notifyDataSetChanged();
      AppMethodBeat.o(108609);
      return;
      setCursor(((ap)((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).getQQListStg()).c(this.Zb, this.gtz, this.gxO));
    }
  }

  public final void KD()
  {
    AppMethodBeat.i(108608);
    KC();
    AppMethodBeat.o(108608);
  }

  public final void a(d.a parama)
  {
    this.gxG = parama;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(108610);
    ao localao = (ao)getItem(paramInt);
    if (paramView == null)
    {
      paramView = View.inflate(this.crP, 2130969602, null);
      paramViewGroup = new f.b(this, paramView);
      paramView.setTag(paramViewGroup);
      paramViewGroup.gtF = paramInt;
      paramViewGroup.account = localao.gwC;
      paramViewGroup.status = localao.gwD;
      paramViewGroup.gtO.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.crP, localao.getDisplayName(), paramViewGroup.gtO.getTextSize()));
      paramViewGroup.gtP.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.crP, localao.Hs(), paramViewGroup.gtP.getTextSize()));
      if (!this.gxO)
        break label363;
      if (p.cB(paramViewGroup.account) == 0)
        break label843;
    }
    label181: label197: label843: for (Object localObject = b.fr(localao.gwC); ; localObject = null)
    {
      int i;
      if (localObject == null)
      {
        paramViewGroup.eks.setImageDrawable(com.tencent.mm.bz.a.g(this.crP, 2131231172));
        if (!this.gxO)
          break label378;
        paramViewGroup.gtH.setVisibility(8);
        localObject = (ao)getItem(paramInt - 1);
        if (localObject != null)
          break label676;
        i = -1;
        label217: if (localObject == null)
          break label686;
        localObject = ((ao)localObject).toString();
        label229: ab.d("MicroMsg.QQFriendAdapterCaseB", "qq friend pre:%s", new Object[] { localObject });
        if (localao == null)
          break label694;
        localObject = localao.toString();
        ab.d("MicroMsg.QQFriendAdapterCaseB", "qq friend:%s", new Object[] { localObject });
        if (paramInt != 0)
          break label733;
        localObject = b(localao);
        if (!bo.isNullOrNil((String)localObject))
          break label702;
        ab.w("MicroMsg.QQFriendAdapterCaseB", "get display show head return null, user[%s] pos[%d]", new Object[] { localao.getUsername(), Integer.valueOf(paramInt) });
        paramViewGroup.gtN.setVisibility(8);
      }
      while (true)
      {
        AppMethodBeat.o(108610);
        return paramView;
        paramViewGroup = (f.b)paramView.getTag();
        break;
        paramViewGroup.eks.setImageBitmap((Bitmap)localObject);
        break label181;
        label363: a.b.b(paramViewGroup.eks, localao.getUsername());
        break label181;
        label378: switch (localao.gwD)
        {
        default:
        case 1:
        case 2:
        }
        while (true)
          switch (localao.frT)
          {
          default:
            break;
          case 0:
          case 2:
            paramViewGroup.gnh.setVisibility(0);
            paramViewGroup.gtQ.setVisibility(4);
            break;
            if ((((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoJ(localao.getUsername())) || (r.Yz().equals(localao.getUsername())))
            {
              paramViewGroup.gtH.setClickable(false);
              paramViewGroup.gtH.setBackgroundDrawable(null);
              paramViewGroup.gnh.setText(2131300086);
              paramViewGroup.gnh.setTextColor(this.crP.getResources().getColor(2131690205));
            }
            else if (localao.frT == 2)
            {
              paramViewGroup.gtH.setClickable(false);
              paramViewGroup.gtH.setBackgroundDrawable(null);
              paramViewGroup.gnh.setText(2131300091);
              paramViewGroup.gnh.setTextColor(this.crP.getResources().getColor(2131690205));
            }
            else
            {
              paramViewGroup.gtH.setClickable(true);
              paramViewGroup.gtH.setBackgroundResource(2130838000);
              paramViewGroup.gnh.setText(2131300085);
              paramViewGroup.gnh.setTextColor(this.crP.getResources().getColor(2131690691));
            }
            break;
          case 1:
          }
        paramViewGroup.gnh.setVisibility(4);
        paramViewGroup.gtQ.setVisibility(0);
        break label197;
        i = ((ao)localObject).frS;
        break label217;
        localObject = "";
        break label229;
        localObject = "";
        break label259;
        paramViewGroup.gtN.setVisibility(0);
        paramViewGroup.gtN.setText((CharSequence)localObject);
        paramViewGroup.gtN.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        continue;
        label733: if (localao.frS != i);
        for (i = 1; ; i = 0)
        {
          localObject = b(localao);
          if ((!bo.isNullOrNil((String)localObject)) && (i != 0))
            break label812;
          ab.w("MicroMsg.QQFriendAdapterCaseB", "get display show head return null, user[%s] pos[%d]", new Object[] { localao.getUsername(), Integer.valueOf(paramInt) });
          paramViewGroup.gtN.setVisibility(8);
          break;
        }
        paramViewGroup.gtN.setVisibility(0);
        paramViewGroup.gtN.setText((CharSequence)localObject);
        paramViewGroup.gtN.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
      }
    }
  }

  public final void qj(String paramString)
  {
  }

  public final void vM(String paramString)
  {
    AppMethodBeat.i(108607);
    this.gtz = bo.vA(paramString.trim());
    bIf();
    KC();
    AppMethodBeat.o(108607);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.f
 * JD-Core Version:    0.6.2
 */
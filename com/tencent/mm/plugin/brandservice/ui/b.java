package com.tencent.mm.plugin.brandservice.ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.bvn;
import com.tencent.mm.protocal.protobuf.uy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.sortview.a.a;
import java.io.IOException;

public final class b extends com.tencent.mm.plugin.brandservice.ui.base.a
{
  private static com.tencent.mm.ui.base.sortview.a.b jKQ;
  CharSequence gnx;
  protected String iconUrl;
  protected CharSequence jKF;
  protected boolean jKI;
  protected boolean jKJ;
  protected String jKR;
  protected String username;

  public b(Object paramObject, String paramString)
  {
    super(6, paramObject);
    this.jKR = paramString;
  }

  public final void a(Context paramContext, a.a parama, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(13874);
    if (this.yDq)
      AppMethodBeat.o(13874);
    while (true)
    {
      return;
      if ((paramContext == null) || (parama == null) || (this.data == null))
      {
        ab.e("MicroMsg.BizRecommDataItem", "Context or ViewHolder or DataItem or DataItem.data is null.");
        AppMethodBeat.o(13874);
        continue;
      }
      if (!(parama instanceof b.a))
      {
        ab.e("MicroMsg.BizRecommDataItem", "The DataItem is not a instance of BizProductViewHolder.");
        AppMethodBeat.o(13874);
        continue;
      }
      if (!(this.data instanceof bvn))
      {
        ab.e("MicroMsg.BizRecommDataItem", "The data is not a instance of SearchOrRecommendItem.");
        AppMethodBeat.o(13874);
        continue;
      }
      b.a locala = (b.a)parama;
      paramArrayOfObject = (bvn)this.data;
      if (paramArrayOfObject.wyX != null)
        parama = paramArrayOfObject.wyX.toString();
      try
      {
        while (true)
        {
          this.gnx = com.tencent.mm.pluginsdk.ui.e.j.b(paramContext, parama, locala.ejp.getTextSize());
          this.iconUrl = paramArrayOfObject.vXn;
          this.username = paramArrayOfObject.wcB.toString();
          AppMethodBeat.o(13874);
          break;
          parama = "";
        }
      }
      catch (Exception paramContext)
      {
        while (true)
          this.gnx = "";
      }
    }
  }

  public final com.tencent.mm.ui.base.sortview.a.b aVY()
  {
    AppMethodBeat.i(13872);
    if (jKQ == null)
      jKQ = new com.tencent.mm.ui.base.sortview.a.b()
      {
        public final void a(Context paramAnonymousContext, a.a paramAnonymousa, com.tencent.mm.ui.base.sortview.a paramAnonymousa1)
        {
          int i = 0;
          AppMethodBeat.i(13870);
          if ((paramAnonymousContext == null) || (paramAnonymousa == null) || (paramAnonymousa1 == null) || (paramAnonymousa1.getData() == null))
          {
            ab.e("MicroMsg.BizRecommDataItem", "Context or ViewHolder or DataItem or DataItem.data is null.");
            AppMethodBeat.o(13870);
          }
          while (true)
          {
            return;
            if (!(paramAnonymousa instanceof b.a))
            {
              ab.e("MicroMsg.BizRecommDataItem", "The ViewHolder is not a instance of BizRecommViewHolder.");
              AppMethodBeat.o(13870);
            }
            else
            {
              if ((paramAnonymousa1.getData() instanceof bvn))
                break;
              ab.e("MicroMsg.BizRecommDataItem", "The ViewHolder is not a instance of SearchOrRecommendItem.");
              AppMethodBeat.o(13870);
            }
          }
          paramAnonymousContext = (b.a)paramAnonymousa;
          paramAnonymousa = (b)paramAnonymousa1;
          paramAnonymousContext.username = paramAnonymousa.username;
          paramAnonymousContext.iconUrl = paramAnonymousa.iconUrl;
          com.tencent.mm.pluginsdk.ui.a.b.r(paramAnonymousContext.ejo, paramAnonymousa.username);
          paramAnonymousContext.ejp.setText(paramAnonymousa.gnx, TextView.BufferType.SPANNABLE);
          paramAnonymousa1 = paramAnonymousContext.jKP;
          if (paramAnonymousa.jKJ)
          {
            j = 0;
            label157: paramAnonymousa1.setVisibility(j);
            paramAnonymousa1 = paramAnonymousContext.jKL;
            if (!paramAnonymousa.jKI)
              break label227;
          }
          label227: for (int j = i; ; j = 8)
          {
            paramAnonymousa1.setVisibility(j);
            paramAnonymousContext.jKM.setText(paramAnonymousa.jKF, TextView.BufferType.SPANNABLE);
            com.tencent.mm.plugin.brandservice.b.a.b(paramAnonymousContext.jKK, paramAnonymousa.jKR);
            AppMethodBeat.o(13870);
            break;
            j = 8;
            break label157;
          }
        }

        public final void a(View paramAnonymousView, a.a paramAnonymousa)
        {
          AppMethodBeat.i(13871);
          if ((paramAnonymousView != null) && (paramAnonymousa != null) && ((paramAnonymousa instanceof b.a)))
          {
            paramAnonymousa = (b.a)paramAnonymousa;
            paramAnonymousa.ejo = ((ImageView)paramAnonymousView.findViewById(2131823652));
            paramAnonymousa.ejp = ((TextView)paramAnonymousView.findViewById(2131824267));
            paramAnonymousa.jKK = ((TextView)paramAnonymousView.findViewById(2131821069));
            paramAnonymousa.jKP = paramAnonymousView.findViewById(2131824269);
            paramAnonymousa.jKL = paramAnonymousView.findViewById(2131824270);
            paramAnonymousa.jKM = ((TextView)paramAnonymousView.findViewById(2131824272));
          }
          AppMethodBeat.o(13871);
        }

        public final boolean a(Context paramAnonymousContext, com.tencent.mm.ui.base.sortview.a paramAnonymousa, Object[] paramAnonymousArrayOfObject)
        {
          AppMethodBeat.i(13868);
          boolean bool;
          if (!(paramAnonymousa instanceof b))
          {
            bool = false;
            AppMethodBeat.o(13868);
            return bool;
          }
          b localb = (b)paramAnonymousa;
          bvn localbvn = (bvn)paramAnonymousa.getData();
          String str1;
          if (localbvn.wyX != null)
          {
            str1 = localbvn.wyX.wVI;
            label58: if (localbvn.wcB == null)
              break label109;
          }
          label109: for (String str2 = localbvn.wcB.wVI; ; str2 = null)
          {
            if (!bo.isNullOrNil(str2))
              break label115;
            ab.e("MicroMsg.BizRecommDataItem", "onItemClick but username is null");
            bool = false;
            AppMethodBeat.o(13868);
            break;
            str1 = null;
            break label58;
          }
          label115: ad localad = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(str2);
          Intent localIntent = new Intent();
          if (com.tencent.mm.n.a.jh(localad.field_type))
          {
            localIntent.putExtra("Contact_User", str2);
            localIntent.putExtra("Contact_Scene", 55);
          }
          while (true)
          {
            com.tencent.mm.plugin.brandservice.b.gkE.c(localIntent, paramAnonymousContext);
            str1 = null;
            paramAnonymousContext = str1;
            if (paramAnonymousArrayOfObject != null)
            {
              paramAnonymousContext = str1;
              if (paramAnonymousArrayOfObject.length > 0)
              {
                paramAnonymousContext = str1;
                if ((paramAnonymousArrayOfObject[0] instanceof c))
                  paramAnonymousContext = (c)paramAnonymousArrayOfObject[0];
              }
            }
            paramAnonymousArrayOfObject = localb.aWm();
            if ((paramAnonymousArrayOfObject != null) && (paramAnonymousContext != null))
              paramAnonymousArrayOfObject.a(paramAnonymousContext, paramAnonymousa, 1, str2, localb.aWn(), localb.getPosition());
            bool = true;
            AppMethodBeat.o(13868);
            break;
            localIntent.putExtra("Contact_User", str2);
            localIntent.putExtra("Contact_Alias", localbvn.guS);
            localIntent.putExtra("Contact_Nick", str1);
            localIntent.putExtra("Contact_Signature", localbvn.guQ);
            localIntent.putExtra("Contact_RegionCode", RegionCodeDecoder.aC(localbvn.guW, localbvn.guO, localbvn.guP));
            localIntent.putExtra("Contact_Sex", localbvn.guN);
            localIntent.putExtra("Contact_VUser_Info", localbvn.wBU);
            localIntent.putExtra("Contact_VUser_Info_Flag", localbvn.wBT);
            localIntent.putExtra("Contact_KWeibo_flag", localbvn.wBX);
            localIntent.putExtra("Contact_KWeibo", localbvn.wBV);
            localIntent.putExtra("Contact_KWeiboNick", localbvn.wBW);
            localIntent.putExtra("Contact_Scene", 55);
            if (localbvn.wCa != null)
              try
              {
                localIntent.putExtra("Contact_customInfo", localbvn.wCa.toByteArray());
              }
              catch (IOException localIOException)
              {
                ab.printErrStackTrace("MicroMsg.BizRecommDataItem", localIOException, "", new Object[0]);
              }
          }
        }

        public final View c(Context paramAnonymousContext, View paramAnonymousView)
        {
          AppMethodBeat.i(13869);
          View localView = paramAnonymousView;
          if (paramAnonymousView == null)
            localView = View.inflate(paramAnonymousContext, 2130970571, null);
          AppMethodBeat.o(13869);
          return localView;
        }
      };
    com.tencent.mm.ui.base.sortview.a.b localb = jKQ;
    AppMethodBeat.o(13872);
    return localb;
  }

  public final a.a aVZ()
  {
    AppMethodBeat.i(13873);
    b.a locala = new b.a();
    AppMethodBeat.o(13873);
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.b
 * JD-Core Version:    0.6.2
 */
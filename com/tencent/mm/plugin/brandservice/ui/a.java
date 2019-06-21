package com.tencent.mm.plugin.brandservice.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.d;
import com.tencent.mm.aj.d.b;
import com.tencent.mm.aj.d.b.d;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.bvo;
import com.tencent.mm.protocal.protobuf.mg;
import com.tencent.mm.protocal.protobuf.mi;
import com.tencent.mm.protocal.protobuf.mn;
import com.tencent.mm.protocal.protobuf.uz;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

public final class a extends com.tencent.mm.plugin.brandservice.ui.base.a
{
  private static a.b jKE;
  protected String iconUrl;
  protected CharSequence jKF;
  protected CharSequence jKG;
  protected CharSequence jKH;
  protected boolean jKI;
  protected boolean jKJ;
  protected CharSequence nickName;
  protected String username;

  public a(Object paramObject)
  {
    super(5, paramObject);
  }

  public final void a(Context paramContext, com.tencent.mm.ui.base.sortview.a.a parama, Object[] paramArrayOfObject)
  {
    Object localObject = null;
    AppMethodBeat.i(13867);
    if (this.yDq)
      AppMethodBeat.o(13867);
    while (true)
    {
      return;
      if ((paramContext == null) || (parama == null) || (this.data == null))
      {
        ab.e("MicroMsg.BizContactDataItem", "Context or ViewHolder or DataItem or DataItem.data is null.");
        AppMethodBeat.o(13867);
        continue;
      }
      if (!(parama instanceof a.a))
      {
        ab.e("MicroMsg.BizContactDataItem", "The DataItem is not a instance of BizContactViewHolder.");
        AppMethodBeat.o(13867);
        continue;
      }
      if (!(this.data instanceof mn))
      {
        ab.e("MicroMsg.BizContactDataItem", "The ViewHolder is not a instance of BusinessResultItem.");
        AppMethodBeat.o(13867);
        continue;
      }
      a.a locala = (a.a)parama;
      parama = (mn)this.data;
      if ((parama.vQv == null) || (parama.vQv.vQb == null))
      {
        ab.e("MicroMsg.BizContactDataItem", "The brItem.ContactItem or brItem.ContactItem.ContactItem is null.");
        AppMethodBeat.o(13867);
        continue;
      }
      bvo localbvo = parama.vQv.vQb;
      parama = parama.vQv.vPY;
      if ((paramArrayOfObject != null) && (paramArrayOfObject.length > 1) && ((paramArrayOfObject[1] instanceof List)))
        this.jMJ = ((List)paramArrayOfObject[1]);
      this.username = localbvo.wcB.wVI;
      this.iconUrl = localbvo.vXn;
      if (parama == null)
      {
        parama = "";
        label224: this.jKG = parama;
        if (localbvo.wyX != null)
          break label621;
        parama = null;
      }
      try
      {
        paramArrayOfObject = this.jMJ;
        locala.emg.getTextSize();
        this.nickName = com.tencent.mm.plugin.brandservice.b.a.b(paramContext, parama, paramArrayOfObject);
        paramArrayOfObject = localbvo.wcB.wVI;
        uz localuz = localbvo.wWC;
        if (localuz != null)
        {
          parama = new d();
          parama.field_username = paramArrayOfObject;
          com.tencent.mm.plugin.brandservice.b.a.a(parama, localuz);
          paramArrayOfObject = localObject;
          if (parama != null)
          {
            paramArrayOfObject = localObject;
            if (parama.cJ(false) != null)
              paramArrayOfObject = parama.cJ(false).aek();
          }
          if (paramArrayOfObject != null)
          {
            if ((parama.cJ(false).aem()) && (!bo.isNullOrNil(paramArrayOfObject.fvS)))
            {
              bool = true;
              this.jKJ = bool;
              if (localbvo.wBT == 0)
                break label649;
              bool = true;
              this.jKI = bool;
            }
          }
          else
          {
            ab.v("MicroMsg.BizContactDataItem", "verifyFlag : %d", new Object[] { Integer.valueOf(localbvo.wBT) });
            parama = localbvo.guS;
            if ((this.jMJ.size() <= 0) || (parama == null) || (!parama.toLowerCase().equals(((String)this.jMJ.get(0)).toLowerCase())));
          }
        }
      }
      catch (Exception parama)
      {
        while (true)
        {
          try
          {
            paramArrayOfObject = this.jMJ;
            locala.jKO.getTextSize();
            this.jKH = com.tencent.mm.plugin.brandservice.b.a.b(paramContext, parama, paramArrayOfObject);
            this.jKH = TextUtils.concat(new CharSequence[] { paramContext.getResources().getString(2131302833), this.jKH });
            if ((this.jKH != null) && (this.jKH.length() != 0) && (this.jKG != null))
              if (this.jKG.length() != 0)
                continue;
          }
          catch (Exception parama)
          {
            try
            {
              paramArrayOfObject = localbvo.guQ;
              parama = this.jMJ;
              locala.jKM.getTextSize();
              this.jKF = com.tencent.mm.plugin.brandservice.b.a.b(paramContext, paramArrayOfObject, parama);
              ab.d("MicroMsg.BizContactDataItem", "nickName : %s, followFriends : %s.", new Object[] { this.nickName, this.jKG });
              this.yDq = true;
              AppMethodBeat.o(13867);
              break;
              parama = parama.vQh;
              break label224;
              label621: parama = localbvo.wyX.wVI;
              continue;
              parama = parama;
              this.nickName = "";
              continue;
              boolean bool = false;
              continue;
              label649: bool = false;
              continue;
              parama = parama;
              this.jKH = "";
            }
            catch (Exception paramContext)
            {
              this.jKF = "";
              continue;
            }
          }
          parama = null;
        }
      }
    }
  }

  public final com.tencent.mm.ui.base.sortview.a.b aVY()
  {
    AppMethodBeat.i(13865);
    if (jKE == null)
      jKE = new a.b();
    a.b localb = jKE;
    AppMethodBeat.o(13865);
    return localb;
  }

  public final com.tencent.mm.ui.base.sortview.a.a aVZ()
  {
    AppMethodBeat.i(13866);
    a.a locala = new a.a();
    AppMethodBeat.o(13866);
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.a
 * JD-Core Version:    0.6.2
 */
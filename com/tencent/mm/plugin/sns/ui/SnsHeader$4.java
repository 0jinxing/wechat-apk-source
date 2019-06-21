package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelsns.b;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.protocal.protobuf.bav;
import com.tencent.mm.sdk.platformtools.ab;

final class SnsHeader$4
  implements View.OnClickListener
{
  SnsHeader$4(SnsHeader paramSnsHeader, int paramInt1, int paramInt2)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(38950);
    Object localObject1;
    Object localObject2;
    if ((paramView.getTag() instanceof String))
    {
      localObject1 = (String)paramView.getTag();
      ab.i("MicroMsg.SnsHeader", "sns Header localId ".concat(String.valueOf(localObject1)));
      paramView = af.cnF().YT((String)localObject1);
      if ((SnsHeader.h(this.rsb) != null) && (paramView != null))
      {
        localObject2 = new Intent();
        ((Intent)localObject2).setClass(SnsHeader.h(this.rsb), SnsCommentDetailUI.class);
        if ((paramView == null) || (paramView.field_userName == null) || (paramView.field_userName.equals("")))
        {
          ab.i("MicroMsg.SnsHeader", "error cntinfo or username is null");
          AppMethodBeat.o(38950);
        }
      }
    }
    while (true)
    {
      return;
      ((Intent)localObject2).putExtra("INTENT_TALKER", paramView.field_userName);
      ((Intent)localObject2).putExtra("INTENT_SNS_LOCAL_ID", (String)localObject1);
      ((Intent)localObject2).putExtra("INTENT_FROMGALLERY", true);
      localObject1 = b.lY(726);
      ((b)localObject1).mb(this.rsf).mb(this.gvp).mb(paramView.field_createTime);
      ((b)localObject1).ajK();
      SnsHeader.h(this.rsb).startActivity((Intent)localObject2);
      try
      {
        localObject2 = new com/tencent/mm/protocal/protobuf/bav;
        ((bav)localObject2).<init>();
        localObject2 = (bav)((bav)localObject2).parseFrom(paramView.field_postBuf);
        if ((((bav)localObject2).wFm == 201) || (((bav)localObject2).wFm == 210) || (((bav)localObject2).wFm != 211))
        {
          ((bav)localObject2).wFv = true;
          paramView.field_postBuf = ((bav)localObject2).toByteArray();
          af.cnF().b(paramView.reX, paramView);
        }
        AppMethodBeat.o(38950);
      }
      catch (Exception paramView)
      {
      }
      AppMethodBeat.o(38950);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsHeader.4
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.wallet_core.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.utils.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class b
{
  public static View a(Context paramContext, View paramView, Bankcard paramBankcard, int paramInt1, a parama, boolean paramBoolean, int paramInt2)
  {
    AppMethodBeat.i(47876);
    b.a locala;
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramView = View.inflate(paramContext, paramInt1, null);
      locala = new b.a();
      locala.tlu = ((ImageView)paramView.findViewById(2131828647));
      locala.tlq = ((TextView)paramView.findViewById(2131828648));
      locala.tlr = ((TextView)paramView.findViewById(2131828649));
      locala.tlp = ((TextView)paramView.findViewById(2131828653));
      locala.tlv = ((TextView)paramView.findViewById(2131828655));
      locala.tNj = ((ViewGroup)paramView.findViewById(2131828645));
      locala.tlt = ((ImageView)paramView.findViewById(2131828646));
      locala.tlw = ((TextView)paramView.findViewById(2131828656));
      locala.tNl = ((ViewGroup)paramView.findViewById(2131828658));
      locala.tNm = ((TextView)paramView.findViewById(2131828659));
      locala.tNn = ((ImageView)paramView.findViewById(2131828654));
      locala.tNo = ((TextView)paramView.findViewById(2131828657));
      paramView.setTag(locala);
    }
    while (true)
    {
      a(paramContext, locala, paramBankcard, parama, paramBoolean, paramInt2);
      AppMethodBeat.o(47876);
      return paramView;
      locala = (b.a)paramView.getTag();
    }
  }

  private static void a(Context paramContext, b.a parama, Bankcard paramBankcard, a parama1, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(47877);
    if (paramBankcard.field_bankcardState == 1)
    {
      parama.tlv.setVisibility(0);
      if (!paramBoolean)
        break label191;
      parama.tNo.setText(paramContext.getString(2131304608));
      parama.tNo.setVisibility(0);
      label47: if (1 != paramInt)
        break label235;
      parama.tlq.setVisibility(8);
      label62: if (!com.tencent.mm.model.r.YM())
        break label257;
      parama.tlr.setVisibility(8);
      label77: if (parama.tlp != null)
        parama.tlp.setText(paramBankcard.field_bankcardTail);
      if ((bo.isNullOrNil(paramBankcard.field_card_bottom_wording)) || (parama.tNm == null))
        break label331;
      parama.tNm.setText(paramBankcard.field_card_bottom_wording);
      parama.tNl.setVisibility(0);
    }
    while (true)
    {
      parama1.a(paramContext, paramBankcard, parama.tlu, parama.tNj, parama.tlt, parama.tNo);
      if (parama.tlw != null)
      {
        com.tencent.mm.plugin.wallet_core.model.r.cPI();
        parama.tlw.setVisibility(8);
      }
      AppMethodBeat.o(47877);
      return;
      parama.tlv.setVisibility(8);
      break;
      label191: if (!bo.isNullOrNil(paramBankcard.field_card_state_name))
      {
        parama.tNo.setText(paramBankcard.field_card_state_name);
        parama.tNo.setVisibility(0);
        break label47;
      }
      parama.tNo.setVisibility(8);
      break label47;
      label235: parama.tlq.setVisibility(0);
      parama.tlq.setText(paramBankcard.field_bankName);
      break label62;
      label257: if (!bo.isNullOrNil(paramBankcard.field_bankcardTypeName))
      {
        parama.tlr.setText(paramBankcard.field_bankcardTypeName);
        break label77;
      }
      if (paramBankcard.cPb())
      {
        parama.tlr.setText(2131305483);
        break label77;
      }
      if (paramBankcard.cPe())
      {
        parama.tlr.setText(2131304760);
        break label77;
      }
      parama.tlr.setText(2131304780);
      break label77;
      label331: parama.tNl.setVisibility(8);
    }
  }

  public static Drawable b(Context paramContext, Bitmap paramBitmap)
  {
    AppMethodBeat.i(47878);
    if (paramBitmap == null)
    {
      AppMethodBeat.o(47878);
      paramContext = null;
    }
    while (true)
    {
      return paramContext;
      try
      {
        byte[] arrayOfByte = paramBitmap.getNinePatchChunk();
        if (NinePatch.isNinePatchChunk(arrayOfByte))
        {
          NinePatchDrawable localNinePatchDrawable = new android/graphics/drawable/NinePatchDrawable;
          paramContext = paramContext.getResources();
          Rect localRect = new android/graphics/Rect;
          localRect.<init>();
          localNinePatchDrawable.<init>(paramContext, paramBitmap, arrayOfByte, localRect, null);
          localNinePatchDrawable.setBounds(0, 0, paramBitmap.getWidth(), paramBitmap.getHeight());
          AppMethodBeat.o(47878);
          paramContext = localNinePatchDrawable;
        }
        else
        {
          paramContext = new BitmapDrawable(paramBitmap);
          AppMethodBeat.o(47878);
        }
      }
      catch (Exception paramContext)
      {
        ab.f("MicroMsg.BankcardListAdapter", paramContext.getMessage());
        ab.printErrStackTrace("MicroMsg.BankcardListAdapter", paramContext, "", new Object[0]);
        AppMethodBeat.o(47878);
        paramContext = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.b
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.api;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.protobuf.bgg;
import com.tencent.mm.protocal.protobuf.but;
import com.tencent.mm.protocal.protobuf.buv;
import com.tencent.mm.protocal.protobuf.bvk;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.e.b;

public final class b
{
  public static void a(Intent paramIntent, but parambut)
  {
    AppMethodBeat.i(11204);
    ((j)g.K(j.class)).a(paramIntent, parambut, 15);
    AppMethodBeat.o(11204);
  }

  public static void a(Intent paramIntent, buv parambuv, int paramInt)
  {
    AppMethodBeat.i(11203);
    ((j)g.K(j.class)).a(paramIntent, parambuv, paramInt);
    AppMethodBeat.o(11203);
  }

  public static void a(Intent paramIntent, bvk parambvk, int paramInt)
  {
    AppMethodBeat.i(11205);
    paramIntent.putExtra("Contact_User", parambvk.jBB);
    paramIntent.putExtra("Contact_Nick", parambvk.jCH);
    paramIntent.putExtra("Contact_PyInitial", parambvk.wbs);
    paramIntent.putExtra("Contact_QuanPin", parambvk.wbt);
    paramIntent.putExtra("Contact_Sex", parambvk.guN);
    paramIntent.putExtra("Contact_Scene", paramInt);
    paramIntent.putExtra("Contact_KHideExpose", true);
    paramIntent.putExtra(e.b.yfT, parambvk.wlF);
    paramIntent.putExtra("key_add_contact_openim_appid", parambvk.fKh);
    paramIntent.putExtra("key_add_contact_match_type", parambvk.wWh);
    paramIntent.putExtra("key_add_contact_custom_detail_visible", parambvk.wWy.wKo);
    paramIntent.putExtra("key_add_contact_custom_detail", parambvk.wWy.naq);
    ab.i("MicroMsg.BuildContactInfoIntent", "[tomys] anti, content: %s", new Object[] { parambvk.wlF });
    AppMethodBeat.o(11205);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.api.b
 * JD-Core Version:    0.6.2
 */
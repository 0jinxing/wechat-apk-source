package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvoiceaddr.ui.b.a;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.voicesearch.VoiceSearchResultUI;

final class ChatroomContactUI$7
  implements b.a
{
  ChatroomContactUI$7(ChatroomContactUI paramChatroomContactUI)
  {
  }

  public final void a(boolean paramBoolean, String[] paramArrayOfString, long paramLong, int paramInt)
  {
    AppMethodBeat.i(33579);
    ab.v("MicroMsg.ChatroomContactUI", "onVoiceReturn");
    if (paramBoolean)
    {
      Intent localIntent = new Intent(this.zls.mController.ylL, VoiceSearchResultUI.class);
      localIntent.putExtra("VoiceSearchResultUI_Resultlist", paramArrayOfString);
      localIntent.putExtra("VoiceSearchResultUI_VoiceId", paramLong);
      localIntent.putExtra("VoiceSearchResultUI_ShowType", paramInt);
      this.zls.mController.ylL.startActivity(localIntent);
      AppMethodBeat.o(33579);
    }
    while (true)
    {
      return;
      paramArrayOfString = new Intent(this.zls.mController.ylL, VoiceSearchResultUI.class);
      paramArrayOfString.putExtra("VoiceSearchResultUI_Resultlist", new String[0]);
      paramArrayOfString.putExtra("VoiceSearchResultUI_Error", this.zls.mController.ylL.getString(2131299946));
      paramArrayOfString.putExtra("VoiceSearchResultUI_VoiceId", paramLong);
      paramArrayOfString.putExtra("VoiceSearchResultUI_ShowType", paramInt);
      this.zls.mController.ylL.startActivity(paramArrayOfString);
      AppMethodBeat.o(33579);
    }
  }

  public final void amJ()
  {
    AppMethodBeat.i(33578);
    ab.v("MicroMsg.ChatroomContactUI", "onVoiceSearchStart");
    this.zls.aqX();
    AppMethodBeat.o(33578);
  }

  public final void apo()
  {
  }

  public final void app()
  {
  }

  public final void apq()
  {
  }

  public final void apr()
  {
  }

  public final boolean vN(String paramString)
  {
    return false;
  }

  public final void vO(String paramString)
  {
    AppMethodBeat.i(33577);
    ab.d("MicroMsg.ChatroomContactUI", "onSearchBarChange %s", new Object[] { paramString });
    paramString = ah.vA(paramString);
    ChatroomContactUI.a(this.zls, paramString);
    AppMethodBeat.o(33577);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ChatroomContactUI.7
 * JD-Core Version:    0.6.2
 */
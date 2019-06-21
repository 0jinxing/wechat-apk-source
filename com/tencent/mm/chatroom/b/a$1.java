package com.tencent.mm.chatroom.b;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.chatroom.ui.SeeRoomManagerUI;
import java.lang.ref.WeakReference;

final class a$1 extends com.tencent.mm.plugin.messenger.a.a
{
  a$1(a parama, WeakReference paramWeakReference, Bundle paramBundle)
  {
  }

  public final void onClickImp(View paramView)
  {
    AppMethodBeat.i(103899);
    if ((this.ehd != null) && (this.ehd.get() != null))
    {
      String str = this.val$params.getString("conv_talker_username");
      Context localContext = (Context)this.ehd.get();
      paramView = new Intent(localContext, SeeRoomManagerUI.class);
      paramView.setFlags(32768);
      paramView.putExtra("RoomInfo_Id", str);
      localContext.startActivity(paramView);
    }
    AppMethodBeat.o(103899);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.b.a.1
 * JD-Core Version:    0.6.2
 */
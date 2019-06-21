package com.tencent.mm.plugin.story.ui.a;

import a.f.b.j;
import a.l;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class b$b
  implements View.OnClickListener
{
  b$b(b paramb, String paramString, b.a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110093);
    j.o(paramView, "it");
    if (paramView.isSelected())
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("Contact_User", this.sfq);
      localIntent.putExtra("Contact_ChatRoomId", this.sfp.gpx);
      localIntent.putExtra("CONTACT_INFO_UI_SOURCE", 15);
      paramView = this.sfr.apJ;
      j.o(paramView, "holder.itemView");
      d.b(paramView.getContext(), "profile", ".ui.ContactInfoUI", localIntent);
    }
    AppMethodBeat.o(110093);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.a.b.b
 * JD-Core Version:    0.6.2
 */
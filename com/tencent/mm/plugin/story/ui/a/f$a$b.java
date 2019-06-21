package com.tencent.mm.plugin.story.ui.a;

import a.f.b.j;
import a.l;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.story.model.b.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class f$a$b
  implements View.OnClickListener
{
  f$a$b(f.a parama, a parama1)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(138851);
    Intent localIntent = new Intent();
    localIntent.putExtra("Contact_User", this.sfO.cEV);
    localIntent.putExtra("CONTACT_INFO_UI_SOURCE", 12);
    paramView = this.sfN.apJ;
    j.o(paramView, "itemView");
    d.b(paramView.getContext(), "profile", ".ui.ContactInfoUI", localIntent);
    AppMethodBeat.o(138851);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.a.f.a.b
 * JD-Core Version:    0.6.2
 */
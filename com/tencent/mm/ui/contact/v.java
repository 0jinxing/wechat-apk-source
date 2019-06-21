package com.tencent.mm.ui.contact;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.openim.a.b;
import com.tencent.mm.openim.a.b.a;
import com.tencent.mm.ui.base.MaskLayout;

public final class v extends LinearLayout
{
  private Context context;
  private String zoe;

  public v(Context paramContext, String paramString)
  {
    super(paramContext);
    AppMethodBeat.i(33813);
    this.context = paramContext;
    this.zoe = paramString;
    paramContext = View.inflate(getContext(), 2130970338, this);
    paramString = findViewById(2131823612);
    paramContext.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(33811);
        paramAnonymousView = paramAnonymousView.getContext();
        Intent localIntent = new Intent(paramAnonymousView, OpenIMAddressUI.class);
        localIntent.addFlags(67108864);
        localIntent.putExtra("key_openim_acctype_id", v.a(v.this));
        paramAnonymousView.startActivity(localIntent);
        AppMethodBeat.o(33811);
      }
    });
    paramString.setOnTouchListener(new v.2(this));
    paramContext = (MaskLayout)paramString.findViewById(2131821798);
    ((b)g.K(b.class)).b(this.zoe, "openim_acct_type_icon", b.a.geS);
    if (this.zoe.equals("cloudim"))
      ((ImageView)paramContext.getContentView()).setImageResource(2131230933);
    paramContext = ((b)g.K(b.class)).b(this.zoe, "openim_acct_type_title", b.a.geR);
    ((TextView)findViewById(2131823613)).setText(paramContext);
    AppMethodBeat.o(33813);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.v
 * JD-Core Version:    0.6.2
 */
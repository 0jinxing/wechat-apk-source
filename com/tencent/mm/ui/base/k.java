package com.tencent.mm.ui.base;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;

public final class k extends AlertDialog
{
  private CharSequence IT;
  private View jcl;
  public BaseAdapter khG;
  private Context mContext;
  private ListView mListView;
  public AdapterView.OnItemClickListener vtI;

  public k(Context paramContext)
  {
    super(paramContext, 2131493867);
    AppMethodBeat.i(106682);
    this.mContext = paramContext;
    if (a.ga(this.mContext));
    for (this.jcl = View.inflate(this.mContext, 2130970122, null); ; this.jcl = View.inflate(this.mContext, 2130970121, null))
    {
      this.mListView = ((ListView)this.jcl.findViewById(2131820986));
      AppMethodBeat.o(106682);
      return;
    }
  }

  public final void dismiss()
  {
    AppMethodBeat.i(106685);
    try
    {
      super.dismiss();
      AppMethodBeat.o(106685);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.MMListDialog", "dismiss exception, e = " + localException.getMessage());
        AppMethodBeat.o(106685);
      }
    }
  }

  protected final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(106683);
    super.onCreate(paramBundle);
    setContentView(this.jcl);
    AppMethodBeat.o(106683);
  }

  public final void setTitle(CharSequence paramCharSequence)
  {
    if (paramCharSequence != null);
    for (this.IT = paramCharSequence; ; this.IT = null)
      return;
  }

  public final void show()
  {
    AppMethodBeat.i(106684);
    if (this.IT != null)
      this.IT.length();
    if (this.vtI != null)
      this.mListView.setOnItemClickListener(this.vtI);
    if (this.khG != null)
      this.mListView.setAdapter(this.khG);
    super.show();
    AppMethodBeat.o(106684);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.k
 * JD-Core Version:    0.6.2
 */
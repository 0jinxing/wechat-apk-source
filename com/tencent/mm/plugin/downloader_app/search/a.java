package com.tencent.mm.plugin.downloader_app.search;

import android.content.Context;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

public final class a extends RecyclerView.a<a>
{
  ArrayList<b> iPr;
  DownloadSearchListView kPj;
  Context mContext;

  a(Context paramContext, DownloadSearchListView paramDownloadSearchListView)
  {
    AppMethodBeat.i(136168);
    this.iPr = new ArrayList();
    this.mContext = paramContext;
    this.kPj = paramDownloadSearchListView;
    AppMethodBeat.o(136168);
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(136170);
    int i = this.iPr.size();
    AppMethodBeat.o(136170);
    return i;
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(136169);
    paramInt = ((b)this.iPr.get(paramInt)).type;
    AppMethodBeat.o(136169);
    return paramInt;
  }

  public final class a extends RecyclerView.v
  {
    public View contentView;
    public View kPk;
    public TextView kPl;
    public View kPm;
    public TextView kPn;
    public ImageView kPo;
    public View kPp;
    public ImageView kPq;
    public Button kPr;
    public TextView kPs;
    public LinearLayout kPt;
    public TextView kPu;

    public a(View arg2)
    {
      super();
      AppMethodBeat.i(136166);
      this.contentView = localView;
      this.kPk = this.contentView.findViewById(2131827271);
      this.kPl = ((TextView)this.contentView.findViewById(2131827273));
      this.kPl.setOnClickListener(new a.a.1(this, a.this));
      this.kPm = this.contentView.findViewById(2131827274);
      this.kPn = ((TextView)this.contentView.findViewById(2131827277));
      this.kPo = ((ImageView)this.contentView.findViewById(2131827276));
      this.kPo.setOnClickListener(new a.a.2(this, a.this));
      this.kPp = this.contentView.findViewById(2131827278);
      this.kPq = ((ImageView)this.contentView.findViewById(2131821433));
      this.kPr = ((Button)this.contentView.findViewById(2131827279));
      this.kPr.setOnClickListener(new a.a.3(this, a.this));
      this.kPs = ((TextView)this.contentView.findViewById(2131821138));
      this.kPt = ((LinearLayout)this.contentView.findViewById(2131827281));
      this.kPu = ((TextView)this.contentView.findViewById(2131827282));
      AppMethodBeat.o(136166);
    }

    static String hE(long paramLong)
    {
      AppMethodBeat.i(136167);
      String str;
      if (paramLong >= 1073741824L)
      {
        str = String.format("%.1fGB", new Object[] { Float.valueOf((float)paramLong / 1024.0F / 1024.0F / 1024.0F) });
        AppMethodBeat.o(136167);
      }
      while (true)
      {
        return str;
        if (paramLong >= 1048576L)
        {
          str = String.format("%.1fMB", new Object[] { Float.valueOf((float)paramLong / 1024.0F / 1024.0F) });
          AppMethodBeat.o(136167);
        }
        else
        {
          str = String.format("%.2fMB", new Object[] { Float.valueOf((float)paramLong / 1024.0F / 1024.0F) });
          AppMethodBeat.o(136167);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.search.a
 * JD-Core Version:    0.6.2
 */
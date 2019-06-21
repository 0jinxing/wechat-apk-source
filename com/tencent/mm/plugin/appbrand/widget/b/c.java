package com.tencent.mm.plugin.appbrand.widget.b;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.f;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.AuthorizeItemListView;
import java.util.LinkedList;

public final class c extends b
{
  private final String hBX;
  private AuthorizeItemListView jbH;
  private c.b jbI;
  private LinearLayout jbJ;
  private final String mAppName;
  private Context mContext;

  public c(Context paramContext, LinkedList<c.c> paramLinkedList, String paramString1, String paramString2, c.a parama)
  {
    super(paramContext, (byte)0);
    AppMethodBeat.i(102357);
    this.mContext = paramContext;
    this.mAppName = bo.nullAsNil(paramString1);
    this.hBX = paramString2;
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
    {
      paramContext = new IllegalArgumentException("scopeInfoList is empty or null");
      AppMethodBeat.o(102357);
      throw paramContext;
    }
    paramContext = (ViewGroup)LayoutInflater.from(this.mContext).inflate(2130968661, null);
    setContentView(paramContext);
    paramString1 = (ImageView)paramContext.findViewById(2131821137);
    com.tencent.mm.modelappbrand.a.b.abR().a(paramString1, this.hBX, 2130839503, f.fqH);
    ((TextView)paramContext.findViewById(2131821138)).setText(this.mContext.getString(2131301001, new Object[] { this.mAppName }));
    this.jbH = ((AuthorizeItemListView)paramContext.findViewById(2131821140));
    this.jbI = new c.b(paramLinkedList);
    this.jbH.setAdapter(this.jbI);
    if (paramLinkedList.size() > 5)
    {
      this.jbH.afg = paramLinkedList.size();
      this.jbJ = ((LinearLayout)paramContext.findViewById(2131821139));
      paramString1 = (LinearLayout.LayoutParams)this.jbJ.getLayoutParams();
      paramString1.height = this.mContext.getResources().getDimensionPixelSize(2131428472);
      this.jbJ.setLayoutParams(paramString1);
    }
    ((Button)paramContext.findViewById(2131821143)).setOnClickListener(new c.1(this, paramLinkedList, parama, this));
    ((Button)paramContext.findViewById(2131821142)).setOnClickListener(new c.2(this, paramLinkedList, parama, this));
    setCanceledOnTouchOutside(false);
    setOnCancelListener(new c.3(this, parama));
    AppMethodBeat.o(102357);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.b.c
 * JD-Core Version:    0.6.2
 */
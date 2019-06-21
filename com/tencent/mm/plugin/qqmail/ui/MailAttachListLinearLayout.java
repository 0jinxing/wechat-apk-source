package com.tencent.mm.plugin.qqmail.ui;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public class MailAttachListLinearLayout extends LinearLayout
{
  Context context;
  List<String> pyN;

  public MailAttachListLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(68378);
    this.pyN = new ArrayList();
    this.context = paramContext;
    AppMethodBeat.o(68378);
  }

  static String fI(String paramString1, String paramString2)
  {
    Object localObject = null;
    AppMethodBeat.i(68379);
    if ((paramString1 == null) || (paramString1.length() == 0) || (paramString2.length() == 0))
    {
      AppMethodBeat.o(68379);
      paramString1 = localObject;
    }
    while (true)
    {
      return paramString1;
      int i = paramString1.indexOf(paramString2);
      if (i == -1)
      {
        AppMethodBeat.o(68379);
        paramString1 = localObject;
      }
      else
      {
        int j = paramString1.indexOf("&", i);
        int k = j;
        if (j == -1)
          k = paramString1.length();
        paramString1 = paramString1.substring(i + paramString2.length() + 1, k);
        AppMethodBeat.o(68379);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.MailAttachListLinearLayout
 * JD-Core Version:    0.6.2
 */
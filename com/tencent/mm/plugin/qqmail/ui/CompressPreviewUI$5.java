package com.tencent.mm.plugin.qqmail.ui;

import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.qqmail.b.v.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;

final class CompressPreviewUI$5 extends v.a
{
  CompressPreviewUI$5(CompressPreviewUI paramCompressPreviewUI)
  {
  }

  public final void onError(int paramInt, String paramString)
  {
    AppMethodBeat.i(68244);
    if (paramInt == -5)
    {
      CompressPreviewUI.j(this.pxt).a(new CompressPreviewUI.5.1(this));
      AppMethodBeat.o(68244);
    }
    while (true)
    {
      return;
      CompressPreviewUI.k(this.pxt).setVisibility(8);
      CompressPreviewUI.l(this.pxt).setVisibility(0);
      CompressPreviewUI.d(this.pxt).setVisibility(8);
      AppMethodBeat.o(68244);
    }
  }

  public final void onSuccess(String paramString, Map<String, String> paramMap)
  {
    AppMethodBeat.i(68243);
    CompressPreviewUI.b(this.pxt, (String)paramMap.get(".Response.result.compressfilepath"));
    int i = bo.getInt((String)paramMap.get(".Response.result.filelist.count"), 0);
    int j = 0;
    while (true)
      if (j < i)
        try
        {
          Object localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>(".Response.result.filelist.list.item");
          label72: Object localObject2;
          Object localObject3;
          int k;
          int m;
          boolean bool;
          String str;
          CompressPreviewUI.a locala;
          CompressPreviewUI localCompressPreviewUI;
          if (j > 0)
          {
            paramString = Integer.valueOf(j);
            paramString = paramString;
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            localObject1 = (String)paramMap.get(paramString + ".path");
            if (localObject1 != null)
            {
              localObject1 = URLDecoder.decode((String)localObject1, "utf-8");
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              localObject2 = (String)paramMap.get(paramString + ".parentpath");
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              k = bo.getInt((String)paramMap.get(paramString + ".size"), 0);
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              m = bo.getInt((String)paramMap.get(paramString + ".type"), 0);
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              bool = ((String)paramMap.get(paramString + ".preview")).equals("1");
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              str = (String)paramMap.get(paramString + ".name");
              localObject3 = CompressPreviewUI.h(this.pxt);
              locala = new com/tencent/mm/plugin/qqmail/ui/CompressPreviewUI$a;
              localCompressPreviewUI = this.pxt;
              if (k != 0)
                break label387;
            }
          }
          for (paramString = ""; ; paramString = bo.ga(k) + ")")
          {
            locala.<init>(localCompressPreviewUI, (String)localObject1, str, (String)localObject2, m, paramString, bool);
            ((List)localObject3).add(locala);
            j++;
            break;
            paramString = "";
            break label72;
            label387: paramString = new java/lang/StringBuilder;
            paramString.<init>("(");
          }
        }
        catch (Exception paramString)
        {
          ab.printErrStackTrace("MicroMsg.CompressPreviewUI", paramString, "", new Object[0]);
        }
    CompressPreviewUI.a(this.pxt, "");
    AppMethodBeat.o(68243);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.CompressPreviewUI.5
 * JD-Core Version:    0.6.2
 */
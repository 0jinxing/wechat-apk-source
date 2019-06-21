package com.tencent.mm.plugin.scanner.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.scanner.a.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.Map;

public final class o$a
{
  public String field_certification;
  public String field_certificationurl;
  public String field_detailurl;
  public String field_exposeurl;
  public String field_extinfo;
  public String field_feedbackurl;
  public int field_functionType;
  public int field_getaction;
  public String field_headerbackgroundurl;
  public String field_headermask;
  public String field_introlink;
  public String field_introtitle;
  public String field_playurl;
  public String field_productid;
  public String field_shareurl;
  public String field_source;
  public String field_subtitle;
  public String field_thumburl;
  public String field_title;
  public int field_type;
  public String field_xml;
  public int field_xmlType;
  public LinkedList<a> qiL;
  public o.a.a qiM;

  public final void n(Map<String, String> paramMap, String paramString)
  {
    AppMethodBeat.i(81474);
    if (paramMap != null)
    {
      this.qiM = new o.a.a();
      this.qiM.qiN = new LinkedList();
      Object localObject1 = paramString + ".bannerlist.banner";
      int i = 0;
      Object localObject2;
      if (i < 1000)
      {
        localObject2 = new StringBuilder().append((String)localObject1);
        if (i > 0);
        for (localObject3 = Integer.valueOf(i); ; localObject3 = "")
        {
          localObject3 = localObject3;
          localObject3 = (String)paramMap.get((String)localObject3 + ".link");
          if (bo.isNullOrNil((String)localObject3))
            break label183;
          localObject2 = new o.a.a.a();
          ((o.a.a.a)localObject2).link = ((String)localObject3);
          this.qiM.qiN.add(localObject2);
          i++;
          break;
        }
      }
      label183: this.qiM.qiO = new LinkedList();
      Object localObject3 = paramString + ".detaillist.detail";
      i = 0;
      if (i < 1000)
      {
        localObject1 = new StringBuilder().append((String)localObject3);
        if (i > 0);
        for (paramString = Integer.valueOf(i); ; paramString = "")
        {
          localObject1 = paramString;
          paramString = (String)paramMap.get((String)localObject1 + ".title");
          localObject2 = (String)paramMap.get((String)localObject1 + ".desc");
          if ((bo.isNullOrNil(paramString)) && (bo.isNullOrNil((String)localObject2)))
            break label379;
          localObject1 = new a.b();
          ((a.b)localObject1).title = paramString;
          ((a.b)localObject1).desc = ((String)localObject2);
          this.qiM.qiO.add(localObject1);
          i++;
          break;
        }
      }
    }
    label379: AppMethodBeat.o(81474);
  }

  public static final class a$b
  {
    public String desc;
    public String title;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.util.o.a
 * JD-Core Version:    0.6.2
 */
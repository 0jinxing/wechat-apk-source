package com.tencent.mm.ui.contact;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.t;
import com.tencent.mm.n.a;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.MaskLayout;
import java.util.Map;

final class SnsLabelContactListUI$a extends BaseAdapter
{
  private Context context;
  private bd rqa;
  private Map<Integer, a> zpn;
  private ColorStateList zpo;
  private ColorStateList zpp;

  // ERROR //
  public SnsLabelContactListUI$a(Context paramContext, java.util.List<java.lang.String> paramList)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 26	android/widget/BaseAdapter:<init>	()V
    //   4: ldc 27
    //   6: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: aconst_null
    //   11: putfield 35	com/tencent/mm/ui/contact/SnsLabelContactListUI$a:context	Landroid/content/Context;
    //   14: aload_0
    //   15: new 37	java/util/HashMap
    //   18: dup
    //   19: invokespecial 38	java/util/HashMap:<init>	()V
    //   22: putfield 40	com/tencent/mm/ui/contact/SnsLabelContactListUI$a:zpn	Ljava/util/Map;
    //   25: aload_0
    //   26: aconst_null
    //   27: putfield 42	com/tencent/mm/ui/contact/SnsLabelContactListUI$a:rqa	Lcom/tencent/mm/storage/bd;
    //   30: aload_0
    //   31: aload_1
    //   32: putfield 35	com/tencent/mm/ui/contact/SnsLabelContactListUI$a:context	Landroid/content/Context;
    //   35: aload_0
    //   36: getfield 40	com/tencent/mm/ui/contact/SnsLabelContactListUI$a:zpn	Ljava/util/Map;
    //   39: invokeinterface 47 1 0
    //   44: invokestatic 53	com/tencent/mm/model/aw:ZK	()Lcom/tencent/mm/model/c;
    //   47: pop
    //   48: aload_0
    //   49: invokestatic 59	com/tencent/mm/model/c:XM	()Lcom/tencent/mm/storage/bd;
    //   52: putfield 42	com/tencent/mm/ui/contact/SnsLabelContactListUI$a:rqa	Lcom/tencent/mm/storage/bd;
    //   55: aload_2
    //   56: invokeinterface 65 1 0
    //   61: astore_2
    //   62: iconst_0
    //   63: istore_3
    //   64: aload_2
    //   65: invokeinterface 71 1 0
    //   70: ifeq +52 -> 122
    //   73: aload_2
    //   74: invokeinterface 75 1 0
    //   79: checkcast 77	java/lang/String
    //   82: astore 4
    //   84: new 79	com/tencent/mm/n/a
    //   87: dup
    //   88: invokespecial 80	com/tencent/mm/n/a:<init>	()V
    //   91: astore 5
    //   93: aload 5
    //   95: aload 4
    //   97: invokevirtual 84	com/tencent/mm/n/a:setUsername	(Ljava/lang/String;)V
    //   100: aload_0
    //   101: getfield 40	com/tencent/mm/ui/contact/SnsLabelContactListUI$a:zpn	Ljava/util/Map;
    //   104: iload_3
    //   105: invokestatic 90	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   108: aload 5
    //   110: invokeinterface 94 3 0
    //   115: pop
    //   116: iinc 3 1
    //   119: goto -55 -> 64
    //   122: aload_1
    //   123: invokevirtual 100	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   126: ldc 101
    //   128: invokevirtual 107	android/content/res/Resources:getXml	(I)Landroid/content/res/XmlResourceParser;
    //   131: astore_2
    //   132: aload_1
    //   133: invokevirtual 100	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   136: ldc 108
    //   138: invokevirtual 107	android/content/res/Resources:getXml	(I)Landroid/content/res/XmlResourceParser;
    //   141: astore 6
    //   143: aload 6
    //   145: astore 4
    //   147: aload_2
    //   148: astore 5
    //   150: aload_0
    //   151: aload_1
    //   152: invokevirtual 100	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   155: aload_2
    //   156: invokestatic 114	android/content/res/ColorStateList:createFromXml	(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;)Landroid/content/res/ColorStateList;
    //   159: putfield 116	com/tencent/mm/ui/contact/SnsLabelContactListUI$a:zpo	Landroid/content/res/ColorStateList;
    //   162: aload 6
    //   164: astore 4
    //   166: aload_2
    //   167: astore 5
    //   169: aload_0
    //   170: aload_1
    //   171: invokevirtual 100	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   174: aload 6
    //   176: invokestatic 114	android/content/res/ColorStateList:createFromXml	(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;)Landroid/content/res/ColorStateList;
    //   179: putfield 118	com/tencent/mm/ui/contact/SnsLabelContactListUI$a:zpp	Landroid/content/res/ColorStateList;
    //   182: aload_2
    //   183: ifnull +9 -> 192
    //   186: aload_2
    //   187: invokeinterface 123 1 0
    //   192: aload 6
    //   194: ifnull +161 -> 355
    //   197: aload 6
    //   199: invokeinterface 123 1 0
    //   204: ldc 27
    //   206: invokestatic 126	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   209: return
    //   210: astore_1
    //   211: aconst_null
    //   212: astore 6
    //   214: aconst_null
    //   215: astore_2
    //   216: aload 6
    //   218: astore 4
    //   220: aload_2
    //   221: astore 5
    //   223: ldc 128
    //   225: aload_1
    //   226: ldc 130
    //   228: iconst_0
    //   229: anewarray 132	java/lang/Object
    //   232: invokestatic 138	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   235: aload_2
    //   236: ifnull +9 -> 245
    //   239: aload_2
    //   240: invokeinterface 123 1 0
    //   245: aload 6
    //   247: ifnull +108 -> 355
    //   250: aload 6
    //   252: invokeinterface 123 1 0
    //   257: ldc 27
    //   259: invokestatic 126	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   262: goto -53 -> 209
    //   265: astore_1
    //   266: aconst_null
    //   267: astore 6
    //   269: aconst_null
    //   270: astore_2
    //   271: aload 6
    //   273: astore 4
    //   275: aload_2
    //   276: astore 5
    //   278: ldc 128
    //   280: aload_1
    //   281: ldc 130
    //   283: iconst_0
    //   284: anewarray 132	java/lang/Object
    //   287: invokestatic 138	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   290: aload_2
    //   291: ifnull +9 -> 300
    //   294: aload_2
    //   295: invokeinterface 123 1 0
    //   300: aload 6
    //   302: ifnull +53 -> 355
    //   305: aload 6
    //   307: invokeinterface 123 1 0
    //   312: ldc 27
    //   314: invokestatic 126	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   317: goto -108 -> 209
    //   320: astore_1
    //   321: aconst_null
    //   322: astore 4
    //   324: aconst_null
    //   325: astore_2
    //   326: aload_2
    //   327: ifnull +9 -> 336
    //   330: aload_2
    //   331: invokeinterface 123 1 0
    //   336: aload 4
    //   338: ifnull +10 -> 348
    //   341: aload 4
    //   343: invokeinterface 123 1 0
    //   348: ldc 27
    //   350: invokestatic 126	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   353: aload_1
    //   354: athrow
    //   355: ldc 27
    //   357: invokestatic 126	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   360: goto -151 -> 209
    //   363: astore_1
    //   364: aconst_null
    //   365: astore 4
    //   367: goto -41 -> 326
    //   370: astore_1
    //   371: aload 5
    //   373: astore_2
    //   374: goto -48 -> 326
    //   377: astore_1
    //   378: aconst_null
    //   379: astore 6
    //   381: goto -110 -> 271
    //   384: astore_1
    //   385: goto -114 -> 271
    //   388: astore_1
    //   389: aconst_null
    //   390: astore 6
    //   392: goto -176 -> 216
    //   395: astore_1
    //   396: goto -180 -> 216
    //
    // Exception table:
    //   from	to	target	type
    //   122	132	210	org/xmlpull/v1/XmlPullParserException
    //   122	132	265	java/io/IOException
    //   122	132	320	finally
    //   132	143	363	finally
    //   150	162	370	finally
    //   169	182	370	finally
    //   223	235	370	finally
    //   278	290	370	finally
    //   132	143	377	java/io/IOException
    //   150	162	384	java/io/IOException
    //   169	182	384	java/io/IOException
    //   132	143	388	org/xmlpull/v1/XmlPullParserException
    //   150	162	395	org/xmlpull/v1/XmlPullParserException
    //   169	182	395	org/xmlpull/v1/XmlPullParserException
  }

  public final int getCount()
  {
    AppMethodBeat.i(33941);
    int i = this.zpn.size();
    AppMethodBeat.o(33941);
    return i;
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(33942);
    Object localObject;
    if (paramInt < 0)
    {
      localObject = null;
      AppMethodBeat.o(33942);
    }
    while (true)
    {
      return localObject;
      a locala = (a)this.zpn.get(Integer.valueOf(paramInt));
      localObject = locala;
      if (locala.field_showHead == 0)
      {
        ad localad = this.rqa.aoO(locala.field_username);
        localObject = locala;
        if (localad != null)
        {
          this.zpn.put(Integer.valueOf(paramInt), localad);
          localObject = localad;
        }
      }
      AppMethodBeat.o(33942);
    }
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(33943);
    a locala;
    TextView localTextView;
    if (paramView == null)
    {
      paramView = View.inflate(this.context, 2130969223, null);
      paramViewGroup = new SnsLabelContactListUI.c((byte)0);
      paramViewGroup.nBN = ((TextView)paramView.findViewById(2131821069));
      paramViewGroup.emP = ((MaskLayout)paramView.findViewById(2131821072));
      paramViewGroup.emg = ((TextView)paramView.findViewById(2131821079));
      paramViewGroup.zpr = ((TextView)paramView.findViewById(2131821080));
      paramView.setTag(paramViewGroup);
      getItem(paramInt);
      locala = (a)getItem(paramInt);
      paramViewGroup.nBN.setVisibility(8);
      localTextView = paramViewGroup.emg;
      if (t.nI(locala.field_username))
        break label228;
    }
    label228: for (ColorStateList localColorStateList = this.zpo; ; localColorStateList = this.zpp)
    {
      localTextView.setTextColor(localColorStateList);
      a.b.t((ImageView)paramViewGroup.emP.getContentView(), locala.field_username);
      paramViewGroup.zpr.setVisibility(8);
      paramViewGroup.emP.setVisibility(0);
      paramViewGroup.emg.setText(j.b(this.context, locala.Oj(), paramViewGroup.emg.getTextSize()));
      paramViewGroup.emg.setVisibility(0);
      AppMethodBeat.o(33943);
      return paramView;
      paramViewGroup = (SnsLabelContactListUI.c)paramView.getTag();
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SnsLabelContactListUI.a
 * JD-Core Version:    0.6.2
 */
package android.support.v4.content.a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class a
{
  public static a a(XmlPullParser paramXmlPullParser, Resources paramResources)
  {
    Object localObject = null;
    int i;
    do
      i = paramXmlPullParser.next();
    while ((i != 2) && (i != 1));
    if (i != 2)
      throw new XmlPullParserException("No start tag found");
    paramXmlPullParser.require(2, null, "font-family");
    if (paramXmlPullParser.getName().equals("font-family"));
    for (paramXmlPullParser = b(paramXmlPullParser, paramResources); ; paramXmlPullParser = localObject)
    {
      return paramXmlPullParser;
      a(paramXmlPullParser);
    }
  }

  public static List<List<byte[]>> a(Resources paramResources, int paramInt)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    if (paramInt != 0)
    {
      TypedArray localTypedArray = paramResources.obtainTypedArray(paramInt);
      localObject1 = localObject2;
      if (localTypedArray.length() > 0)
      {
        localObject1 = new ArrayList();
        if (localTypedArray.getResourceId(0, 0) != 0);
        for (int i = 1; ; i = 0)
        {
          if (i == 0)
            break label106;
          for (paramInt = 0; paramInt < localTypedArray.length(); paramInt++)
            ((List)localObject1).add(b(paramResources.getStringArray(localTypedArray.getResourceId(paramInt, 0))));
        }
      }
      localTypedArray.recycle();
    }
    if (localObject1 != null);
    while (true)
    {
      return localObject1;
      label106: ((List)localObject1).add(b(paramResources.getStringArray(paramInt)));
      break;
      localObject1 = Collections.emptyList();
    }
  }

  private static void a(XmlPullParser paramXmlPullParser)
  {
    int i = 1;
    while (i > 0)
      switch (paramXmlPullParser.next())
      {
      default:
        break;
      case 2:
        i++;
        break;
      case 3:
        i--;
      }
  }

  private static a b(XmlPullParser paramXmlPullParser, Resources paramResources)
  {
    TypedArray localTypedArray = paramResources.obtainAttributes(Xml.asAttributeSet(paramXmlPullParser), android.support.a.a.a.FontFamily);
    Object localObject = localTypedArray.getString(0);
    String str1 = localTypedArray.getString(1);
    String str2 = localTypedArray.getString(2);
    int i = localTypedArray.getResourceId(3, 0);
    int j = localTypedArray.getInteger(4, 1);
    int k = localTypedArray.getInteger(5, 500);
    localTypedArray.recycle();
    if ((localObject != null) && (str1 != null) && (str2 != null))
    {
      while (paramXmlPullParser.next() != 3)
        a(paramXmlPullParser);
      paramXmlPullParser = new d(new android.support.v4.d.a((String)localObject, str1, str2, a(paramResources, i)), j, k);
    }
    while (true)
    {
      return paramXmlPullParser;
      localObject = new ArrayList();
      while (paramXmlPullParser.next() != 3)
        if (paramXmlPullParser.getEventType() == 2)
          if (paramXmlPullParser.getName().equals("font"))
            ((List)localObject).add(c(paramXmlPullParser, paramResources));
          else
            a(paramXmlPullParser);
      if (((List)localObject).isEmpty())
        paramXmlPullParser = null;
      else
        paramXmlPullParser = new b((c[])((List)localObject).toArray(new c[((List)localObject).size()]));
    }
  }

  private static List<byte[]> b(String[] paramArrayOfString)
  {
    ArrayList localArrayList = new ArrayList();
    int i = paramArrayOfString.length;
    for (int j = 0; j < i; j++)
      localArrayList.add(Base64.decode(paramArrayOfString[j], 0));
    return localArrayList;
  }

  private static c c(XmlPullParser paramXmlPullParser, Resources paramResources)
  {
    int i = 5;
    boolean bool = true;
    TypedArray localTypedArray = paramResources.obtainAttributes(Xml.asAttributeSet(paramXmlPullParser), android.support.a.a.a.FontFamilyFont);
    int j;
    if (localTypedArray.hasValue(5))
    {
      j = localTypedArray.getInt(i, 400);
      if (!localTypedArray.hasValue(3))
        break label113;
      i = 3;
      label48: if (1 != localTypedArray.getInt(i, 0))
        break label118;
      label59: if (!localTypedArray.hasValue(4))
        break label123;
    }
    int k;
    label113: label118: label123: for (i = 4; ; i = 0)
    {
      k = localTypedArray.getResourceId(i, 0);
      paramResources = localTypedArray.getString(i);
      localTypedArray.recycle();
      while (paramXmlPullParser.next() != 3)
        a(paramXmlPullParser);
      i = 1;
      break;
      i = 2;
      break label48;
      bool = false;
      break label59;
    }
    return new c(paramResources, j, bool, k);
  }

  public static abstract interface a
  {
  }

  public static final class b
    implements a.a
  {
    public final a.c[] GN;

    public b(a.c[] paramArrayOfc)
    {
      this.GN = paramArrayOfc;
    }
  }

  public static final class c
  {
    public int GO;
    public boolean GP;
    public int GQ;
    public final String mFileName;

    public c(String paramString, int paramInt1, boolean paramBoolean, int paramInt2)
    {
      this.mFileName = paramString;
      this.GO = paramInt1;
      this.GP = paramBoolean;
      this.GQ = paramInt2;
    }
  }

  public static final class d
    implements a.a
  {
    public final android.support.v4.d.a GR;
    public final int GS;
    public final int GU;

    public d(android.support.v4.d.a parama, int paramInt1, int paramInt2)
    {
      this.GR = parama;
      this.GU = paramInt1;
      this.GS = paramInt2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.content.a.a
 * JD-Core Version:    0.6.2
 */
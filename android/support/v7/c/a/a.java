package android.support.v7.c.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.v4.a.b;
import android.support.v7.a.a.a;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

final class a
{
  private static ColorStateList c(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    int i = paramXmlPullParser.getDepth() + 1;
    Object localObject1 = new int[20][];
    int[] arrayOfInt = new int[20];
    int j = 0;
    int k;
    int m;
    do
    {
      k = paramXmlPullParser.next();
      if (k == 1)
        break;
      m = paramXmlPullParser.getDepth();
      if ((m < i) && (k == 3))
        break;
    }
    while ((k != 2) || (m > i) || (!paramXmlPullParser.getName().equals("item")));
    Object localObject2 = a.a.ColorStateListItem;
    label106: int n;
    float f;
    label137: label162: int i2;
    if (paramTheme == null)
    {
      localObject2 = paramResources.obtainAttributes(paramAttributeSet, (int[])localObject2);
      n = ((TypedArray)localObject2).getColor(0, -65281);
      f = 1.0F;
      if (!((TypedArray)localObject2).hasValue(1))
        break label242;
      f = ((TypedArray)localObject2).getFloat(1, 1.0F);
      ((TypedArray)localObject2).recycle();
      k = 0;
      int i1 = paramAttributeSet.getAttributeCount();
      localObject2 = new int[i1];
      m = 0;
      if (m >= i1)
        break label271;
      i2 = paramAttributeSet.getAttributeNameResource(m);
      if ((i2 == 16843173) || (i2 == 16843551) || (i2 == 2130772301))
        break label367;
      if (!paramAttributeSet.getAttributeBooleanValue(m, false))
        break label263;
      label212: localObject2[k] = i2;
      k++;
    }
    label263: label271: label367: 
    while (true)
    {
      m++;
      break label162;
      localObject2 = paramTheme.obtainStyledAttributes(paramAttributeSet, (int[])localObject2, 0, 0);
      break label106;
      label242: if (!((TypedArray)localObject2).hasValue(2))
        break label137;
      f = ((TypedArray)localObject2).getFloat(2, 1.0F);
      break label137;
      i2 = -i2;
      break label212;
      localObject2 = StateSet.trimStateSet((int[])localObject2, k);
      arrayOfInt = c.c(arrayOfInt, j, b.u(n, Math.round(f * Color.alpha(n))));
      localObject1 = (int[][])c.a((Object[])localObject1, j, localObject2);
      j++;
      break;
      paramResources = new int[j];
      paramXmlPullParser = new int[j][];
      System.arraycopy(arrayOfInt, 0, paramResources, 0, j);
      System.arraycopy(localObject1, 0, paramXmlPullParser, 0, j);
      return new ColorStateList(paramXmlPullParser, paramResources);
    }
  }

  public static ColorStateList createFromXml(Resources paramResources, XmlPullParser paramXmlPullParser, Resources.Theme paramTheme)
  {
    AttributeSet localAttributeSet = Xml.asAttributeSet(paramXmlPullParser);
    int i;
    do
      i = paramXmlPullParser.next();
    while ((i != 2) && (i != 1));
    if (i != 2)
      throw new XmlPullParserException("No start tag found");
    String str = paramXmlPullParser.getName();
    if (!str.equals("selector"))
      throw new XmlPullParserException(paramXmlPullParser.getPositionDescription() + ": invalid color state list tag " + str);
    return c(paramResources, paramXmlPullParser, localAttributeSet, paramTheme);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.c.a.a
 * JD-Core Version:    0.6.2
 */
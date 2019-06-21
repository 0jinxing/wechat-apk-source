package android.support.v7.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.support.v7.a.a.a;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.k;
import android.support.v7.widget.aa;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

public final class g extends MenuInflater
{
  static final Class<?>[] YU = arrayOfClass;
  static final Class<?>[] YV = arrayOfClass;
  final Object[] YW;
  final Object[] YX;
  Object YY;
  Context mContext;

  static
  {
    Class[] arrayOfClass = new Class[1];
    arrayOfClass[0] = Context.class;
  }

  public g(Context paramContext)
  {
    super(paramContext);
    this.mContext = paramContext;
    this.YW = new Object[] { paramContext };
    this.YX = this.YW;
  }

  static Object N(Object paramObject)
  {
    while (true)
    {
      if ((paramObject instanceof Activity));
      while (!(paramObject instanceof ContextWrapper))
        return paramObject;
      paramObject = ((ContextWrapper)paramObject).getBaseContext();
    }
  }

  private void a(XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Menu paramMenu)
  {
    b localb = new b(paramMenu);
    int i = paramXmlPullParser.getEventType();
    label49: int k;
    int m;
    if (i == 2)
    {
      paramMenu = paramXmlPullParser.getName();
      if (paramMenu.equals("menu"))
      {
        i = paramXmlPullParser.next();
        int j = 0;
        paramMenu = null;
        k = 0;
        m = i;
        i = j;
        label65: if (i != 0)
          return;
      }
    }
    switch (m)
    {
    default:
    case 2:
    case 3:
      while (true)
      {
        m = paramXmlPullParser.next();
        break label65;
        throw new RuntimeException("Expecting menu, got ".concat(String.valueOf(paramMenu)));
        k = paramXmlPullParser.next();
        i = k;
        if (k != 1)
          break;
        i = k;
        break label49;
        if (k == 0)
        {
          String str = paramXmlPullParser.getName();
          if (str.equals("group"))
          {
            localb.d(paramAttributeSet);
          }
          else if (str.equals("item"))
          {
            localb.e(paramAttributeSet);
          }
          else if (str.equals("menu"))
          {
            a(paramXmlPullParser, paramAttributeSet, localb.gf());
          }
          else
          {
            paramMenu = str;
            k = 1;
            continue;
            str = paramXmlPullParser.getName();
            if ((k != 0) && (str.equals(paramMenu)))
            {
              paramMenu = null;
              k = 0;
            }
            else if (str.equals("group"))
            {
              localb.gd();
            }
            else if (str.equals("item"))
            {
              if (!localb.Zh)
                if ((localb.ZA != null) && (localb.ZA.hasSubMenu()))
                  localb.gf();
                else
                  localb.ge();
            }
            else if (str.equals("menu"))
            {
              i = 1;
            }
          }
        }
      }
    case 1:
    }
    throw new RuntimeException("Unexpected end of document");
  }

  // ERROR //
  public final void inflate(int paramInt, Menu paramMenu)
  {
    // Byte code:
    //   0: aload_2
    //   1: instanceof 141
    //   4: ifne +10 -> 14
    //   7: aload_0
    //   8: iload_1
    //   9: aload_2
    //   10: invokespecial 143	android/view/MenuInflater:inflate	(ILandroid/view/Menu;)V
    //   13: return
    //   14: aconst_null
    //   15: astore_3
    //   16: aconst_null
    //   17: astore 4
    //   19: aconst_null
    //   20: astore 5
    //   22: aload_0
    //   23: getfield 38	android/support/v7/view/g:mContext	Landroid/content/Context;
    //   26: invokevirtual 147	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   29: iload_1
    //   30: invokevirtual 153	android/content/res/Resources:getLayout	(I)Landroid/content/res/XmlResourceParser;
    //   33: astore 6
    //   35: aload 6
    //   37: astore 5
    //   39: aload 6
    //   41: astore_3
    //   42: aload 6
    //   44: astore 4
    //   46: aload_0
    //   47: aload 6
    //   49: aload 6
    //   51: invokestatic 159	android/util/Xml:asAttributeSet	(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
    //   54: aload_2
    //   55: invokespecial 111	android/support/v7/view/g:a	(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
    //   58: aload 6
    //   60: ifnull -47 -> 13
    //   63: aload 6
    //   65: invokeinterface 164 1 0
    //   70: goto -57 -> 13
    //   73: astore 4
    //   75: aload 5
    //   77: astore_3
    //   78: new 166	android/view/InflateException
    //   81: astore_2
    //   82: aload 5
    //   84: astore_3
    //   85: aload_2
    //   86: ldc 168
    //   88: aload 4
    //   90: invokespecial 171	android/view/InflateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   93: aload 5
    //   95: astore_3
    //   96: aload_2
    //   97: athrow
    //   98: astore_2
    //   99: aload_3
    //   100: ifnull +9 -> 109
    //   103: aload_3
    //   104: invokeinterface 164 1 0
    //   109: aload_2
    //   110: athrow
    //   111: astore_2
    //   112: aload 4
    //   114: astore_3
    //   115: new 166	android/view/InflateException
    //   118: astore 5
    //   120: aload 4
    //   122: astore_3
    //   123: aload 5
    //   125: ldc 168
    //   127: aload_2
    //   128: invokespecial 171	android/view/InflateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   131: aload 4
    //   133: astore_3
    //   134: aload 5
    //   136: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   22	35	73	org/xmlpull/v1/XmlPullParserException
    //   46	58	73	org/xmlpull/v1/XmlPullParserException
    //   22	35	98	finally
    //   46	58	98	finally
    //   78	82	98	finally
    //   85	93	98	finally
    //   96	98	98	finally
    //   115	120	98	finally
    //   123	131	98	finally
    //   134	137	98	finally
    //   22	35	111	java/io/IOException
    //   46	58	111	java/io/IOException
  }

  static final class a
    implements MenuItem.OnMenuItemClickListener
  {
    private static final Class<?>[] YZ = { MenuItem.class };
    private Object YY;
    private Method mMethod;

    public a(Object paramObject, String paramString)
    {
      this.YY = paramObject;
      Class localClass = paramObject.getClass();
      try
      {
        this.mMethod = localClass.getMethod(paramString, YZ);
        return;
      }
      catch (Exception paramObject)
      {
        paramString = new InflateException("Couldn't resolve menu item onClick handler " + paramString + " in class " + localClass.getName());
        paramString.initCause(paramObject);
      }
      throw paramString;
    }

    public final boolean onMenuItemClick(MenuItem paramMenuItem)
    {
      boolean bool = true;
      try
      {
        if (this.mMethod.getReturnType() == Boolean.TYPE)
          bool = ((Boolean)this.mMethod.invoke(this.YY, new Object[] { paramMenuItem })).booleanValue();
        while (true)
        {
          return bool;
          this.mMethod.invoke(this.YY, new Object[] { paramMenuItem });
        }
      }
      catch (Exception paramMenuItem)
      {
      }
      throw new RuntimeException(paramMenuItem);
    }
  }

  final class b
  {
    android.support.v4.view.b ZA;
    private CharSequence ZB;
    private CharSequence ZC;
    private ColorStateList ZD = null;
    private PorterDuff.Mode ZE = null;
    private Menu Za;
    private int Zb;
    private int Zc;
    private int Zd;
    private int Ze;
    private boolean Zf;
    private boolean Zg;
    boolean Zh;
    private int Zi;
    private int Zj;
    private CharSequence Zk;
    private CharSequence Zl;
    private int Zm;
    private char Zn;
    private int Zo;
    private char Zp;
    private int Zq;
    private int Zr;
    private boolean Zs;
    private boolean Zt;
    private boolean Zu;
    private int Zv;
    private int Zw;
    private String Zx;
    private String Zy;
    private String Zz;

    public b(Menu arg2)
    {
      Object localObject;
      this.Za = localObject;
      gd();
    }

    private static char Q(String paramString)
    {
      char c1 = '\000';
      if (paramString == null);
      for (char c2 = c1; ; c2 = c1)
      {
        return c2;
        c1 = paramString.charAt(0);
      }
    }

    private void d(MenuItem paramMenuItem)
    {
      int i = 1;
      Object localObject = paramMenuItem.setChecked(this.Zs).setVisible(this.Zt).setEnabled(this.Zu);
      if (this.Zr > 0);
      for (boolean bool = true; ; bool = false)
      {
        ((MenuItem)localObject).setCheckable(bool).setTitleCondensed(this.Zl).setIcon(this.Zm);
        if (this.Zv >= 0)
          paramMenuItem.setShowAsAction(this.Zv);
        if (this.Zz == null)
          break label166;
        if (!g.this.mContext.isRestricted())
          break;
        throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
      }
      localObject = g.this;
      if (((g)localObject).YY == null)
        ((g)localObject).YY = g.N(((g)localObject).mContext);
      paramMenuItem.setOnMenuItemClickListener(new g.a(((g)localObject).YY, this.Zz));
      label166: if (this.Zr >= 2)
      {
        if ((paramMenuItem instanceof j))
          ((j)paramMenuItem).V(true);
      }
      else
      {
        if (this.Zx == null)
          break label410;
        paramMenuItem.setActionView((View)newInstance(this.Zx, g.YU, g.this.YW));
      }
      while (true)
      {
        while (true)
        {
          if ((this.Zw > 0) && (i == 0))
            paramMenuItem.setActionView(this.Zw);
          if (this.ZA != null)
            android.support.v4.view.g.a(paramMenuItem, this.ZA);
          android.support.v4.view.g.a(paramMenuItem, this.ZB);
          android.support.v4.view.g.b(paramMenuItem, this.ZC);
          android.support.v4.view.g.b(paramMenuItem, this.Zn, this.Zo);
          android.support.v4.view.g.a(paramMenuItem, this.Zp, this.Zq);
          if (this.ZE != null)
            android.support.v4.view.g.a(paramMenuItem, this.ZE);
          if (this.ZD != null)
            android.support.v4.view.g.a(paramMenuItem, this.ZD);
          return;
          if (!(paramMenuItem instanceof k))
            break;
          localObject = (k)paramMenuItem;
          try
          {
            if (((k)localObject).acb == null)
              ((k)localObject).acb = ((android.support.v4.b.a.b)((k)localObject).aar).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[] { Boolean.TYPE });
            ((k)localObject).acb.invoke(((k)localObject).aar, new Object[] { Boolean.TRUE });
          }
          catch (Exception localException)
          {
          }
        }
        break;
        label410: i = 0;
      }
    }

    private <T> T newInstance(String paramString, Class<?>[] paramArrayOfClass, Object[] paramArrayOfObject)
    {
      try
      {
        paramString = g.this.mContext.getClassLoader().loadClass(paramString).getConstructor(paramArrayOfClass);
        paramString.setAccessible(true);
        paramString = paramString.newInstance(paramArrayOfObject);
        return paramString;
      }
      catch (Exception paramString)
      {
        while (true)
          paramString = null;
      }
    }

    public final void d(AttributeSet paramAttributeSet)
    {
      paramAttributeSet = g.this.mContext.obtainStyledAttributes(paramAttributeSet, a.a.MenuGroup);
      this.Zb = paramAttributeSet.getResourceId(1, 0);
      this.Zc = paramAttributeSet.getInt(3, 0);
      this.Zd = paramAttributeSet.getInt(4, 0);
      this.Ze = paramAttributeSet.getInt(5, 0);
      this.Zf = paramAttributeSet.getBoolean(2, true);
      this.Zg = paramAttributeSet.getBoolean(0, true);
      paramAttributeSet.recycle();
    }

    public final void e(AttributeSet paramAttributeSet)
    {
      int i = 1;
      paramAttributeSet = g.this.mContext.obtainStyledAttributes(paramAttributeSet, a.a.MenuItem);
      this.Zi = paramAttributeSet.getResourceId(2, 0);
      this.Zj = (paramAttributeSet.getInt(5, this.Zc) & 0xFFFF0000 | paramAttributeSet.getInt(6, this.Zd) & 0xFFFF);
      this.Zk = paramAttributeSet.getText(7);
      this.Zl = paramAttributeSet.getText(8);
      this.Zm = paramAttributeSet.getResourceId(0, 0);
      this.Zn = Q(paramAttributeSet.getString(9));
      this.Zo = paramAttributeSet.getInt(13, 4096);
      this.Zp = Q(paramAttributeSet.getString(10));
      this.Zq = paramAttributeSet.getInt(14, 4096);
      int j;
      if (paramAttributeSet.hasValue(11))
        if (paramAttributeSet.getBoolean(11, false))
        {
          j = 1;
          this.Zr = j;
          label167: this.Zs = paramAttributeSet.getBoolean(3, false);
          this.Zt = paramAttributeSet.getBoolean(4, this.Zf);
          this.Zu = paramAttributeSet.getBoolean(1, this.Zg);
          this.Zv = paramAttributeSet.getInt(15, -1);
          this.Zz = paramAttributeSet.getString(12);
          this.Zw = paramAttributeSet.getResourceId(16, 0);
          this.Zx = paramAttributeSet.getString(17);
          this.Zy = paramAttributeSet.getString(18);
          if (this.Zy == null)
            break label399;
          j = i;
          label264: if ((j == 0) || (this.Zw != 0) || (this.Zx != null))
            break label404;
          this.ZA = ((android.support.v4.view.b)newInstance(this.Zy, g.YV, g.this.YX));
          label307: this.ZB = paramAttributeSet.getText(19);
          this.ZC = paramAttributeSet.getText(20);
          if (!paramAttributeSet.hasValue(22))
            break label412;
          this.ZE = aa.d(paramAttributeSet.getInt(22, -1), this.ZE);
          label354: if (!paramAttributeSet.hasValue(21))
            break label420;
        }
      label399: label404: label412: label420: for (this.ZD = paramAttributeSet.getColorStateList(21); ; this.ZD = null)
      {
        paramAttributeSet.recycle();
        this.Zh = false;
        return;
        j = 0;
        break;
        this.Zr = this.Ze;
        break label167;
        j = 0;
        break label264;
        this.ZA = null;
        break label307;
        this.ZE = null;
        break label354;
      }
    }

    public final void gd()
    {
      this.Zb = 0;
      this.Zc = 0;
      this.Zd = 0;
      this.Ze = 0;
      this.Zf = true;
      this.Zg = true;
    }

    public final void ge()
    {
      this.Zh = true;
      d(this.Za.add(this.Zb, this.Zi, this.Zj, this.Zk));
    }

    public final SubMenu gf()
    {
      this.Zh = true;
      SubMenu localSubMenu = this.Za.addSubMenu(this.Zb, this.Zi, this.Zj, this.Zk);
      d(localSubMenu.getItem());
      return localSubMenu;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.view.g
 * JD-Core Version:    0.6.2
 */
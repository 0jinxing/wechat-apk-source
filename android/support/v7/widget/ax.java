package android.support.v7.widget;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.v4.content.b;
import android.support.v4.widget.o;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

final class ax extends o
  implements View.OnClickListener
{
  private final SearchView arD;
  private final SearchableInfo aro;
  private final WeakHashMap<String, Drawable.ConstantState> art;
  private final Context asA;
  private final int asB;
  int asC = 1;
  private ColorStateList asD;
  private int asE = -1;
  private int asF = -1;
  private int asG = -1;
  private int asH = -1;
  private int asI = -1;
  private int asJ = -1;
  private final SearchManager asz = (SearchManager)this.mContext.getSystemService("search");
  private boolean mClosed = false;

  public ax(Context paramContext, SearchView paramSearchView, SearchableInfo paramSearchableInfo, WeakHashMap<String, Drawable.ConstantState> paramWeakHashMap)
  {
    super(paramContext, paramSearchView.getSuggestionRowLayout());
    this.arD = paramSearchView;
    this.aro = paramSearchableInfo;
    this.asB = paramSearchView.getSuggestionCommitIconResId();
    this.asA = paramContext;
    this.art = paramWeakHashMap;
  }

  private Drawable V(String paramString)
  {
    Object localObject1;
    if ((paramString == null) || (paramString.isEmpty()) || ("0".equals(paramString)))
      localObject1 = null;
    while (true)
    {
      return localObject1;
      try
      {
        int i = Integer.parseInt(paramString);
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>("android.resource://");
        String str = this.asA.getPackageName() + "/" + i;
        localDrawable = W(str);
        localObject1 = localDrawable;
        if (localDrawable == null)
        {
          localObject1 = b.g(this.asA, i);
          a(str, (Drawable)localObject1);
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        Drawable localDrawable = W(paramString);
        localObject2 = localDrawable;
        if (localDrawable == null)
        {
          localObject2 = d(Uri.parse(paramString));
          a(paramString, (Drawable)localObject2);
        }
      }
      catch (Resources.NotFoundException paramString)
      {
        Object localObject2 = null;
      }
    }
  }

  private Drawable W(String paramString)
  {
    paramString = (Drawable.ConstantState)this.art.get(paramString);
    if (paramString == null);
    for (paramString = null; ; paramString = paramString.newDrawable())
      return paramString;
  }

  private static String a(Cursor paramCursor, int paramInt)
  {
    Object localObject = null;
    if (paramInt == -1)
      paramCursor = localObject;
    while (true)
    {
      return paramCursor;
      try
      {
        paramCursor = paramCursor.getString(paramInt);
      }
      catch (Exception paramCursor)
      {
        paramCursor = localObject;
      }
    }
  }

  public static String a(Cursor paramCursor, String paramString)
  {
    return a(paramCursor, paramCursor.getColumnIndex(paramString));
  }

  private static void a(ImageView paramImageView, Drawable paramDrawable, int paramInt)
  {
    paramImageView.setImageDrawable(paramDrawable);
    if (paramDrawable == null)
      paramImageView.setVisibility(paramInt);
    while (true)
    {
      return;
      paramImageView.setVisibility(0);
      paramDrawable.setVisible(false, false);
      paramDrawable.setVisible(true, false);
    }
  }

  private static void a(TextView paramTextView, CharSequence paramCharSequence)
  {
    paramTextView.setText(paramCharSequence);
    if (TextUtils.isEmpty(paramCharSequence))
      paramTextView.setVisibility(8);
    while (true)
    {
      return;
      paramTextView.setVisibility(0);
    }
  }

  private void a(String paramString, Drawable paramDrawable)
  {
    if (paramDrawable != null)
      this.art.put(paramString, paramDrawable.getConstantState());
  }

  private static void c(Cursor paramCursor)
  {
    if (paramCursor != null);
    for (paramCursor = paramCursor.getExtras(); ; paramCursor = null)
    {
      if ((paramCursor != null) && (paramCursor.getBoolean("in_progress")));
      return;
    }
  }

  // ERROR //
  private Drawable d(Uri paramUri)
  {
    // Byte code:
    //   0: ldc 245
    //   2: aload_1
    //   3: invokevirtual 248	android/net/Uri:getScheme	()Ljava/lang/String;
    //   6: invokevirtual 109	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   9: istore_2
    //   10: iload_2
    //   11: ifeq +67 -> 78
    //   14: aload_0
    //   15: aload_1
    //   16: invokespecial 251	android/support/v7/widget/ax:e	(Landroid/net/Uri;)Landroid/graphics/drawable/Drawable;
    //   19: astore_3
    //   20: aload_3
    //   21: astore_1
    //   22: aload_1
    //   23: areturn
    //   24: astore_3
    //   25: new 241	java/io/FileNotFoundException
    //   28: astore_3
    //   29: aload_3
    //   30: ldc 253
    //   32: aload_1
    //   33: invokestatic 257	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   36: invokevirtual 261	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   39: invokespecial 262	java/io/FileNotFoundException:<init>	(Ljava/lang/String;)V
    //   42: aload_3
    //   43: athrow
    //   44: astore_3
    //   45: new 117	java/lang/StringBuilder
    //   48: dup
    //   49: ldc_w 264
    //   52: invokespecial 122	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   55: aload_1
    //   56: invokevirtual 267	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   59: ldc_w 269
    //   62: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   65: aload_3
    //   66: invokevirtual 272	java/io/FileNotFoundException:getMessage	()Ljava/lang/String;
    //   69: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: pop
    //   73: aconst_null
    //   74: astore_1
    //   75: goto -53 -> 22
    //   78: aload_0
    //   79: getfield 86	android/support/v7/widget/ax:asA	Landroid/content/Context;
    //   82: invokevirtual 276	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   85: aload_1
    //   86: invokevirtual 282	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   89: astore 4
    //   91: aload 4
    //   93: ifnonnull +23 -> 116
    //   96: new 241	java/io/FileNotFoundException
    //   99: astore_3
    //   100: aload_3
    //   101: ldc_w 284
    //   104: aload_1
    //   105: invokestatic 257	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   108: invokevirtual 261	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   111: invokespecial 262	java/io/FileNotFoundException:<init>	(Ljava/lang/String;)V
    //   114: aload_3
    //   115: athrow
    //   116: aload 4
    //   118: aconst_null
    //   119: invokestatic 288	android/graphics/drawable/Drawable:createFromStream	(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    //   122: astore_3
    //   123: aload 4
    //   125: invokevirtual 294	java/io/InputStream:close	()V
    //   128: aload_3
    //   129: astore_1
    //   130: goto -108 -> 22
    //   133: astore 4
    //   135: new 117	java/lang/StringBuilder
    //   138: astore 4
    //   140: aload 4
    //   142: ldc_w 296
    //   145: invokespecial 122	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   148: aload 4
    //   150: aload_1
    //   151: invokevirtual 267	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   154: pop
    //   155: aload_3
    //   156: astore_1
    //   157: goto -135 -> 22
    //   160: astore_3
    //   161: aload 4
    //   163: invokevirtual 294	java/io/InputStream:close	()V
    //   166: aload_3
    //   167: athrow
    //   168: astore 4
    //   170: new 117	java/lang/StringBuilder
    //   173: astore 4
    //   175: aload 4
    //   177: ldc_w 296
    //   180: invokespecial 122	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   183: aload 4
    //   185: aload_1
    //   186: invokevirtual 267	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   189: pop
    //   190: goto -24 -> 166
    //
    // Exception table:
    //   from	to	target	type
    //   14	20	24	android/content/res/Resources$NotFoundException
    //   0	10	44	java/io/FileNotFoundException
    //   14	20	44	java/io/FileNotFoundException
    //   25	44	44	java/io/FileNotFoundException
    //   78	91	44	java/io/FileNotFoundException
    //   96	116	44	java/io/FileNotFoundException
    //   123	128	44	java/io/FileNotFoundException
    //   135	155	44	java/io/FileNotFoundException
    //   161	166	44	java/io/FileNotFoundException
    //   166	168	44	java/io/FileNotFoundException
    //   170	190	44	java/io/FileNotFoundException
    //   123	128	133	java/io/IOException
    //   116	123	160	finally
    //   161	166	168	java/io/IOException
  }

  private Drawable e(Uri paramUri)
  {
    String str = paramUri.getAuthority();
    if (TextUtils.isEmpty(str))
      throw new FileNotFoundException("No authority: ".concat(String.valueOf(paramUri)));
    List localList;
    try
    {
      Resources localResources = this.mContext.getPackageManager().getResourcesForApplication(str);
      localList = paramUri.getPathSegments();
      if (localList == null)
        throw new FileNotFoundException("No path: ".concat(String.valueOf(paramUri)));
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      throw new FileNotFoundException("No package found for authority: ".concat(String.valueOf(paramUri)));
    }
    int i = localList.size();
    if (i == 1);
    while (true)
    {
      try
      {
        i = Integer.parseInt((String)localList.get(0));
        if (i != 0)
          break;
        throw new FileNotFoundException("No resource found for: ".concat(String.valueOf(paramUri)));
      }
      catch (NumberFormatException localNumberFormatException)
      {
        throw new FileNotFoundException("Single path segment is not a resource ID: ".concat(String.valueOf(paramUri)));
      }
      if (i == 2)
        i = localNumberFormatException.getIdentifier((String)localList.get(1), (String)localList.get(0), str);
      else
        throw new FileNotFoundException("More than two path segments: ".concat(String.valueOf(paramUri)));
    }
    return localNumberFormatException.getDrawable(i);
  }

  private Drawable getActivityIcon(ComponentName paramComponentName)
  {
    Object localObject1 = null;
    PackageManager localPackageManager = this.mContext.getPackageManager();
    try
    {
      Object localObject2 = localPackageManager.getActivityInfo(paramComponentName, 128);
      int i = ((ActivityInfo)localObject2).getIconResource();
      if (i == 0)
        paramComponentName = localObject1;
      while (true)
      {
        return paramComponentName;
        localObject2 = localPackageManager.getDrawable(paramComponentName.getPackageName(), i, ((ActivityInfo)localObject2).applicationInfo);
        if (localObject2 == null)
        {
          new StringBuilder("Invalid icon resource ").append(i).append(" for ").append(paramComponentName.flattenToShortString());
          paramComponentName = localObject1;
        }
        else
        {
          paramComponentName = (ComponentName)localObject2;
        }
      }
    }
    catch (PackageManager.NameNotFoundException paramComponentName)
    {
      while (true)
        paramComponentName = localObject1;
    }
  }

  public final void a(View paramView, Cursor paramCursor)
  {
    Object localObject1 = null;
    a locala = (a)paramView.getTag();
    if (this.asJ != -1);
    for (int i = paramCursor.getInt(this.asJ); ; i = 0)
    {
      if (locala.asK != null)
      {
        paramView = a(paramCursor, this.asE);
        a(locala.asK, paramView);
      }
      Object localObject2;
      if (locala.asL != null)
      {
        localObject2 = a(paramCursor, this.asG);
        if (localObject2 != null)
        {
          if (this.asD == null)
          {
            paramView = new TypedValue();
            this.mContext.getTheme().resolveAttribute(2130772185, paramView, true);
            this.asD = this.mContext.getResources().getColorStateList(paramView.resourceId);
          }
          paramView = new SpannableString((CharSequence)localObject2);
          paramView.setSpan(new TextAppearanceSpan(null, 0, 0, this.asD, null), 0, ((CharSequence)localObject2).length(), 33);
          if (!TextUtils.isEmpty(paramView))
            break label345;
          if (locala.asK != null)
          {
            locala.asK.setSingleLine(false);
            locala.asK.setMaxLines(2);
          }
          label201: a(locala.asL, paramView);
        }
      }
      else
      {
        if (locala.asM != null)
        {
          ImageView localImageView = locala.asM;
          if (this.asH != -1)
            break label374;
          paramView = null;
          label235: a(localImageView, paramView, 4);
        }
        if (locala.asN != null)
        {
          localObject2 = locala.asN;
          if (this.asI != -1)
            break label519;
          paramView = localObject1;
          label267: a((ImageView)localObject2, paramView, 8);
        }
        if ((this.asC != 2) && ((this.asC != 1) || ((i & 0x1) == 0)))
          break label537;
        locala.asO.setVisibility(0);
        locala.asO.setTag(locala.asK.getText());
        locala.asO.setOnClickListener(this);
      }
      while (true)
      {
        return;
        paramView = a(paramCursor, this.asF);
        break;
        label345: if (locala.asK == null)
          break label201;
        locala.asK.setSingleLine(true);
        locala.asK.setMaxLines(1);
        break label201;
        label374: localObject2 = V(paramCursor.getString(this.asH));
        paramView = (View)localObject2;
        if (localObject2 != null)
          break label235;
        paramView = this.aro.getSearchActivity();
        String str = paramView.flattenToShortString();
        if (this.art.containsKey(str))
        {
          paramView = (Drawable.ConstantState)this.art.get(str);
          if (paramView == null);
          for (localObject2 = null; ; localObject2 = paramView.newDrawable(this.asA.getResources()))
          {
            paramView = (View)localObject2;
            if (localObject2 != null)
              break;
            paramView = this.mContext.getPackageManager().getDefaultActivityIcon();
            break;
          }
        }
        localObject2 = getActivityIcon(paramView);
        if (localObject2 == null);
        for (paramView = null; ; paramView = ((Drawable)localObject2).getConstantState())
        {
          this.art.put(str, paramView);
          break;
        }
        label519: paramView = V(paramCursor.getString(this.asI));
        break label267;
        label537: locala.asO.setVisibility(8);
      }
    }
  }

  public final void changeCursor(Cursor paramCursor)
  {
    if (this.mClosed)
      if (paramCursor != null)
        paramCursor.close();
    while (true)
    {
      return;
      try
      {
        super.changeCursor(paramCursor);
        if (paramCursor != null)
        {
          this.asE = paramCursor.getColumnIndex("suggest_text_1");
          this.asF = paramCursor.getColumnIndex("suggest_text_2");
          this.asG = paramCursor.getColumnIndex("suggest_text_2_url");
          this.asH = paramCursor.getColumnIndex("suggest_icon_1");
          this.asI = paramCursor.getColumnIndex("suggest_icon_2");
          this.asJ = paramCursor.getColumnIndex("suggest_flags");
        }
      }
      catch (Exception paramCursor)
      {
      }
    }
  }

  public final CharSequence convertToString(Cursor paramCursor)
  {
    Object localObject1 = null;
    Object localObject2;
    if (paramCursor == null)
      localObject2 = localObject1;
    while (true)
    {
      return localObject2;
      localObject2 = a(paramCursor, "suggest_intent_query");
      if (localObject2 == null)
        if (this.aro.shouldRewriteQueryFromData())
        {
          localObject2 = a(paramCursor, "suggest_intent_data");
          if (localObject2 != null);
        }
        else
        {
          localObject2 = localObject1;
          if (this.aro.shouldRewriteQueryFromText())
          {
            paramCursor = a(paramCursor, "suggest_text_1");
            localObject2 = localObject1;
            if (paramCursor != null)
              localObject2 = paramCursor;
          }
        }
    }
  }

  public final View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    try
    {
      paramView = super.getDropDownView(paramInt, paramView, paramViewGroup);
      return paramView;
    }
    catch (RuntimeException localRuntimeException)
    {
      while (true)
      {
        paramView = newDropDownView(this.mContext, this.PI, paramViewGroup);
        if (paramView != null)
          ((a)paramView.getTag()).asK.setText(localRuntimeException.toString());
      }
    }
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    try
    {
      paramView = super.getView(paramInt, paramView, paramViewGroup);
      return paramView;
    }
    catch (RuntimeException localRuntimeException)
    {
      while (true)
      {
        paramView = newView(this.mContext, this.PI, paramViewGroup);
        if (paramView != null)
          ((a)paramView.getTag()).asK.setText(localRuntimeException.toString());
      }
    }
  }

  public final boolean hasStableIds()
  {
    return false;
  }

  public final View newView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    paramContext = super.newView(paramContext, paramCursor, paramViewGroup);
    paramContext.setTag(new a(paramContext));
    ((ImageView)paramContext.findViewById(2131820943)).setImageResource(this.asB);
    return paramContext;
  }

  public final void notifyDataSetChanged()
  {
    super.notifyDataSetChanged();
    c(getCursor());
  }

  public final void notifyDataSetInvalidated()
  {
    super.notifyDataSetInvalidated();
    c(getCursor());
  }

  public final void onClick(View paramView)
  {
    paramView = paramView.getTag();
    if ((paramView instanceof CharSequence))
      this.arD.setQuery((CharSequence)paramView);
  }

  public final Cursor runQueryOnBackgroundThread(CharSequence paramCharSequence)
  {
    if (paramCharSequence == null);
    for (paramCharSequence = ""; (this.arD.getVisibility() != 0) || (this.arD.getWindowVisibility() != 0); paramCharSequence = paramCharSequence.toString())
    {
      paramCharSequence = null;
      return paramCharSequence;
    }
    Object localObject;
    while (true)
    {
      try
      {
        localObject = this.aro;
        if (localObject != null)
          break label73;
        paramCharSequence = null;
        if (paramCharSequence != null)
          paramCharSequence.getCount();
      }
      catch (RuntimeException paramCharSequence)
      {
        paramCharSequence = null;
      }
      break;
      label73: str = ((SearchableInfo)localObject).getSuggestAuthority();
      if (str != null)
        break label87;
      paramCharSequence = null;
    }
    label87: Uri.Builder localBuilder = new android/net/Uri$Builder;
    localBuilder.<init>();
    localBuilder = localBuilder.scheme("content").authority(str).query("").fragment("");
    String str = ((SearchableInfo)localObject).getSuggestPath();
    if (str != null)
      localBuilder.appendEncodedPath(str);
    localBuilder.appendPath("search_suggest_query");
    str = ((SearchableInfo)localObject).getSuggestSelection();
    if (str != null)
    {
      localObject = new String[1];
      localObject[0] = paramCharSequence;
    }
    for (paramCharSequence = (CharSequence)localObject; ; paramCharSequence = null)
    {
      localBuilder.appendQueryParameter("limit", "50");
      localObject = localBuilder.build();
      paramCharSequence = this.mContext.getContentResolver().query((Uri)localObject, null, str, paramCharSequence, null);
      break;
      localBuilder.appendPath(paramCharSequence);
    }
  }

  static final class a
  {
    public final TextView asK;
    public final TextView asL;
    public final ImageView asM;
    public final ImageView asN;
    public final ImageView asO;

    public a(View paramView)
    {
      this.asK = ((TextView)paramView.findViewById(16908308));
      this.asL = ((TextView)paramView.findViewById(16908309));
      this.asM = ((ImageView)paramView.findViewById(16908295));
      this.asN = ((ImageView)paramView.findViewById(16908296));
      this.asO = ((ImageView)paramView.findViewById(2131820943));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ax
 * JD-Core Version:    0.6.2
 */
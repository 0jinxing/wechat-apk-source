package com.tencent.ttpic.util;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.BaseUtils;
import com.tencent.ttpic.baseutils.LogUtils;
import java.util.ArrayList;
import java.util.Iterator;

public class WMTokenizer
{
  private static final int ALIGN_BOTTOM = 4;
  private static final int ALIGN_CENTER = 1;
  private static final int ALIGN_LEFT = 0;
  private static final int ALIGN_RIGHT = 2;
  private static final int ALIGN_TOP = 3;
  private static final String ELLIPSIZE = "...";
  private static final String STRING_EMPTY = "";
  private static final String TAG;
  protected int mAlignMode;
  private float mCharHeight;
  private float mCharWidth;
  private boolean mFitIn;
  protected int mHeight;
  protected TextPaint mPaint;
  protected boolean mSingleLine;
  protected float mSpacingPlus;
  protected String mText;
  private RectF mTextRect;
  private float[] mTextWidths;
  private ArrayList<WMTokenizer.Token> mTokens;
  protected boolean mVertical;
  protected int mWidth;

  static
  {
    AppMethodBeat.i(84303);
    TAG = WMTokenizer.class.getSimpleName();
    AppMethodBeat.o(84303);
  }

  public WMTokenizer(String paramString, TextPaint paramTextPaint)
  {
    AppMethodBeat.i(84291);
    this.mTokens = new ArrayList();
    this.mText = paramString;
    this.mPaint = paramTextPaint;
    AppMethodBeat.o(84291);
  }

  public static WMTokenizer from(String paramString, TextPaint paramTextPaint)
  {
    AppMethodBeat.i(84292);
    paramString = new WMTokenizer(paramString, paramTextPaint);
    AppMethodBeat.o(84292);
    return paramString;
  }

  private boolean isDelimiter(char paramChar)
  {
    if ((paramChar == '\n') || (paramChar == '\r') || (paramChar == '\t') || (paramChar == ' ') || (paramChar == ',') || (paramChar == '.') || (paramChar == 65292) || (paramChar == '。'));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void tokenizeHorizontal()
  {
    AppMethodBeat.i(84295);
    if (this.mSingleLine)
    {
      tokenizerHorizontalSingleRow();
      AppMethodBeat.o(84295);
    }
    while (true)
    {
      return;
      tokenizerHorizontalMultiRow();
      AppMethodBeat.o(84295);
    }
  }

  private void tokenizerHorizontalMultiRow()
  {
    AppMethodBeat.i(84297);
    if ((this.mWidth <= 0) || (TextUtils.isEmpty(this.mText)))
      LogUtils.e(TAG, "ERROR => mWidth <= 0 || TextUtils.isEmpty(mText)");
    float f1 = 0.0F;
    int i = 0;
    int j = 0;
    float f2;
    int k;
    if (j < this.mText.length())
    {
      f1 += this.mTextWidths[j];
      if (f1 > this.mWidth)
      {
        f2 = this.mTextWidths[j];
        k = j - 1;
        f1 -= f2;
        label84: if (k <= i)
          break label490;
        if (isDelimiter(this.mText.charAt(k)))
          j = k + 1;
      }
    }
    label490: 
    while (true)
    {
      Object localObject = this.mText.substring(i, j);
      if (TextUtils.isEmpty((CharSequence)localObject))
        LogUtils.e(TAG, "ERROR => TextUtils.isEmpty(textRow)");
      WMTokenizer.Token localToken = new WMTokenizer.Token(this);
      localToken.text = ((String)localObject);
      localToken.width = f1;
      localToken.height = this.mCharHeight;
      this.mTokens.add(localToken);
      f1 = 0.0F;
      i = j;
      break;
      f2 = this.mTextWidths[k];
      k--;
      f1 -= f2;
      break label84;
      f1 += this.mSpacingPlus;
      j++;
      break;
      if (i < this.mText.length())
      {
        localObject = new WMTokenizer.Token(this);
        ((WMTokenizer.Token)localObject).text = this.mText.substring(i);
        ((WMTokenizer.Token)localObject).width = f1;
        ((WMTokenizer.Token)localObject).height = this.mCharHeight;
        this.mTokens.add(localObject);
      }
      if ((this.mHeight <= 0) || (this.mTokens.size() * this.mCharHeight <= this.mHeight));
      for (this.mFitIn = true; (this.mHeight > 0) && (this.mHeight >= this.mCharHeight); this.mFitIn = false)
      {
        j = (int)(this.mHeight / this.mCharHeight);
        if (this.mTokens.size() > j)
        {
          localObject = (WMTokenizer.Token)this.mTokens.get(j - 1);
          if (((WMTokenizer.Token)localObject).text.length() > 3)
            ((WMTokenizer.Token)localObject).text = (((WMTokenizer.Token)localObject).text.substring(0, ((WMTokenizer.Token)localObject).text.length() - 3) + "...");
        }
        while (this.mTokens.size() > j)
          this.mTokens.remove(j);
      }
      LogUtils.d(TAG, "mTokens => " + this.mTokens.toString());
      AppMethodBeat.o(84297);
      return;
    }
  }

  private void tokenizerHorizontalSingleRow()
  {
    AppMethodBeat.i(84296);
    if ((this.mWidth <= 0) || (TextUtils.isEmpty(this.mText)))
      LogUtils.e(TAG, "ERROR => mWidth <= 0 || TextUtils.isEmpty(mText)");
    float f = 0.0F;
    int i = 0;
    if (i < this.mText.length())
    {
      f += this.mTextWidths[i];
      if (f > this.mWidth)
      {
        f -= this.mTextWidths[i];
        i--;
      }
    }
    for (int j = 1; ; j = 0)
    {
      label107: WMTokenizer.Token localToken;
      String str;
      if (((this.mHeight <= 0) || (this.mHeight >= this.mCharHeight)) && (j == 0))
      {
        this.mFitIn = true;
        localToken = new WMTokenizer.Token(this);
        if ((i >= this.mText.length()) || (i <= 2))
          break label271;
        str = this.mText.substring(0, i - 2);
        str = str + "...";
        if (TextUtils.isEmpty(str))
          LogUtils.e(TAG, "ERROR => TextUtils.isEmpty(text2Draw)");
      }
      label271: for (localToken.text = str; ; localToken.text = this.mText)
      {
        localToken.width = f;
        localToken.height = this.mCharHeight;
        this.mTokens.add(localToken);
        LogUtils.d(TAG, "mTokens => " + this.mTokens.toString());
        AppMethodBeat.o(84296);
        return;
        f += this.mSpacingPlus;
        i++;
        break;
        this.mFitIn = false;
        break label107;
      }
    }
  }

  private void tokenizerVertical()
  {
    AppMethodBeat.i(84298);
    if (this.mSingleLine)
    {
      tokenizerVerticalSingleColumn();
      AppMethodBeat.o(84298);
    }
    while (true)
    {
      return;
      tokenizerVerticalMultiColumn();
      AppMethodBeat.o(84298);
    }
  }

  private void tokenizerVerticalMultiColumn()
  {
    AppMethodBeat.i(84300);
    if ((this.mHeight <= 0) || (TextUtils.isEmpty(this.mText)))
      LogUtils.e(TAG, "ERROR => mHeight <= 0 || TextUtils.isEmpty(mText)");
    float f1 = 0.0F;
    int i = 0;
    int j = 0;
    float f2;
    int k;
    if (j < this.mText.length())
    {
      f1 += this.mCharHeight;
      if (f1 > this.mHeight)
      {
        f2 = this.mCharHeight;
        k = j - 1;
        f1 -= f2;
        label80: if (k <= i)
          break label476;
        if (isDelimiter(this.mText.charAt(k)))
          j = k + 1;
      }
    }
    label476: 
    while (true)
    {
      String str = this.mText.substring(i, j);
      if (TextUtils.isEmpty(str))
        LogUtils.e(TAG, "ERROR => TextUtils.isEmpty(textColumn)");
      WMTokenizer.Token localToken = new WMTokenizer.Token(this);
      localToken.text = str;
      localToken.width = this.mCharWidth;
      localToken.height = f1;
      this.mTokens.add(localToken);
      f1 = 0.0F;
      i = j;
      break;
      f2 = this.mCharHeight;
      k--;
      f1 -= f2;
      break label80;
      j++;
      break;
      if (i < this.mText.length())
      {
        localToken = new WMTokenizer.Token(this);
        localToken.text = this.mText.substring(i);
        localToken.width = this.mCharWidth;
        localToken.height = f1;
        this.mTokens.add(localToken);
      }
      if ((this.mWidth <= 0) || (this.mTokens.size() * this.mCharWidth <= this.mWidth));
      for (this.mFitIn = true; (this.mWidth > 0) && (this.mWidth >= this.mCharWidth); this.mFitIn = false)
      {
        j = (int)(this.mWidth / this.mCharWidth);
        if (this.mTokens.size() > j)
        {
          localToken = (WMTokenizer.Token)this.mTokens.get(j - 1);
          if (localToken.text.length() > 3)
            localToken.text = (localToken.text.substring(0, localToken.text.length() - 3) + "...");
        }
        while (this.mTokens.size() > j)
          this.mTokens.remove(j);
      }
      LogUtils.d(TAG, "mTokens => " + this.mTokens.toString());
      AppMethodBeat.o(84300);
      return;
    }
  }

  private void tokenizerVerticalSingleColumn()
  {
    AppMethodBeat.i(84299);
    if ((this.mHeight <= 0) || (TextUtils.isEmpty(this.mText)))
      LogUtils.e(TAG, "ERROR => mHeight <= 0 || TextUtils.isEmpty(mText)");
    WMTokenizer.Token localToken = new WMTokenizer.Token(this);
    localToken.text = this.mText;
    int i = (int)(this.mHeight / this.mCharHeight);
    if (((this.mWidth <= 0) || (this.mWidth >= this.mCharWidth)) && (i > this.mText.length()))
    {
      this.mFitIn = true;
      if (i < this.mText.length())
      {
        String str = this.mText.substring(0, i);
        if (i <= 3)
          break label244;
        str = str.substring(0, i - 3);
        str = str + "...";
        label150: localToken.text = str;
      }
      localToken.width = this.mCharWidth;
      if (i <= this.mText.length())
        break label255;
      i = this.mText.length();
    }
    label244: label255: 
    while (true)
    {
      localToken.height = (i * this.mCharHeight);
      this.mTokens.add(localToken);
      LogUtils.d(TAG, "mTokens => " + this.mTokens.toString());
      AppMethodBeat.o(84299);
      return;
      this.mFitIn = false;
      break;
      LogUtils.e(TAG, "countColumn <= 3");
      break label150;
    }
  }

  public void doLayout()
  {
    AppMethodBeat.i(84301);
    this.mTextRect = new RectF();
    if (this.mTokens.isEmpty())
      AppMethodBeat.o(84301);
    while (true)
    {
      return;
      float f;
      Object localObject1;
      if (this.mVertical)
      {
        f = (this.mWidth - this.mTokens.size() * this.mCharWidth) / 2.0F;
        if (this.mAlignMode == 2)
        {
          f = this.mWidth - this.mCharWidth * this.mTokens.size();
          localObject1 = this.mTokens.iterator();
          label97: if (!((Iterator)localObject1).hasNext())
            break label444;
          localObject2 = (WMTokenizer.Token)((Iterator)localObject1).next();
          switch (this.mAlignMode)
          {
          case 2:
          default:
          case 3:
          case 1:
          case 4:
          }
        }
        while (true)
        {
          ((WMTokenizer.Token)localObject2).x = f;
          f = ((WMTokenizer.Token)localObject2).width + f;
          break label97;
          if (this.mAlignMode != 1)
            break;
          f = (this.mWidth - this.mCharWidth * this.mTokens.size()) / 2.0F;
          break;
          ((WMTokenizer.Token)localObject2).y = 0.0F;
          continue;
          ((WMTokenizer.Token)localObject2).y = ((this.mHeight - ((WMTokenizer.Token)localObject2).height) / 2.0F);
          continue;
          ((WMTokenizer.Token)localObject2).x = (this.mHeight - ((WMTokenizer.Token)localObject2).height);
        }
      }
      else
      {
        f = (this.mHeight - this.mCharHeight * this.mTokens.size()) / 2.0F;
        if (this.mAlignMode == 4)
        {
          f = this.mHeight - this.mCharHeight * this.mTokens.size();
          localObject1 = this.mTokens.iterator();
          label302: if (!((Iterator)localObject1).hasNext())
            break label444;
          localObject2 = (WMTokenizer.Token)((Iterator)localObject1).next();
          switch (this.mAlignMode)
          {
          default:
          case 0:
          case 1:
          case 2:
          }
        }
        while (true)
        {
          ((WMTokenizer.Token)localObject2).y = f;
          f = ((WMTokenizer.Token)localObject2).height + f;
          break label302;
          if (this.mAlignMode != 1)
            break;
          f = (this.mHeight - this.mCharHeight * this.mTokens.size()) / 2.0F;
          break;
          ((WMTokenizer.Token)localObject2).x = 0.0F;
          continue;
          ((WMTokenizer.Token)localObject2).x = ((this.mWidth - ((WMTokenizer.Token)localObject2).width) / 2.0F);
          continue;
          ((WMTokenizer.Token)localObject2).x = (this.mWidth - ((WMTokenizer.Token)localObject2).width);
        }
      }
      label444: this.mTextRect = new RectF();
      Object localObject2 = this.mTokens.iterator();
      if (((Iterator)localObject2).hasNext())
      {
        localObject1 = (WMTokenizer.Token)((Iterator)localObject2).next();
        RectF localRectF = this.mTextRect;
        if (this.mTextRect.left <= ((WMTokenizer.Token)localObject1).x)
        {
          f = this.mTextRect.left;
          label511: localRectF.left = f;
          localRectF = this.mTextRect;
          if (this.mTextRect.right < ((WMTokenizer.Token)localObject1).x + ((WMTokenizer.Token)localObject1).width)
            break label643;
          f = this.mTextRect.right;
          label551: localRectF.right = f;
          localRectF = this.mTextRect;
          if (this.mTextRect.top > ((WMTokenizer.Token)localObject1).y)
            break label656;
          f = this.mTextRect.top;
          label586: localRectF.top = f;
          localRectF = this.mTextRect;
          if (this.mTextRect.bottom < ((WMTokenizer.Token)localObject1).y + ((WMTokenizer.Token)localObject1).height)
            break label664;
        }
        for (f = this.mTextRect.bottom; ; f = ((WMTokenizer.Token)localObject1).height + f)
        {
          localRectF.bottom = f;
          break;
          f = ((WMTokenizer.Token)localObject1).x;
          break label511;
          label643: f = ((WMTokenizer.Token)localObject1).x + ((WMTokenizer.Token)localObject1).width;
          break label551;
          label656: f = ((WMTokenizer.Token)localObject1).y;
          break label586;
          label664: f = ((WMTokenizer.Token)localObject1).y;
        }
      }
      AppMethodBeat.o(84301);
    }
  }

  public float getFontHeight()
  {
    return this.mCharHeight;
  }

  public RectF getTextRect()
  {
    return this.mTextRect;
  }

  public WMTokenizer.Token getToken(int paramInt)
  {
    AppMethodBeat.i(84302);
    WMTokenizer.Token localToken;
    if (BaseUtils.indexOutOfBounds(this.mTokens, paramInt))
    {
      localToken = null;
      AppMethodBeat.o(84302);
    }
    while (true)
    {
      return localToken;
      localToken = (WMTokenizer.Token)this.mTokens.get(paramInt);
      AppMethodBeat.o(84302);
    }
  }

  public ArrayList<WMTokenizer.Token> getTokens()
  {
    return this.mTokens;
  }

  public boolean isFitIn()
  {
    return this.mFitIn;
  }

  public WMTokenizer setAlign(String paramString)
  {
    AppMethodBeat.i(84293);
    if (!TextUtils.isEmpty(paramString))
    {
      if (!paramString.equals("left"))
        break label36;
      this.mAlignMode = 0;
    }
    while (true)
    {
      AppMethodBeat.o(84293);
      return this;
      label36: if (paramString.equals("center"))
        this.mAlignMode = 1;
      else if (paramString.equals("right"))
        this.mAlignMode = 2;
      else if (paramString.equals("up"))
        this.mAlignMode = 3;
      else if (paramString.equals("down"))
        this.mAlignMode = 4;
    }
  }

  public WMTokenizer setHeight(int paramInt)
  {
    this.mHeight = paramInt;
    return this;
  }

  public WMTokenizer setSingleLine(boolean paramBoolean)
  {
    this.mSingleLine = paramBoolean;
    return this;
  }

  public WMTokenizer setSpacingPlus(float paramFloat)
  {
    this.mSpacingPlus = paramFloat;
    return this;
  }

  public WMTokenizer setVertical(boolean paramBoolean)
  {
    this.mVertical = paramBoolean;
    return this;
  }

  public WMTokenizer setWidth(int paramInt)
  {
    this.mWidth = paramInt;
    return this;
  }

  public void tokenizer()
  {
    AppMethodBeat.i(84294);
    this.mTokens.clear();
    this.mCharWidth = 0.0F;
    this.mTextWidths = new float[this.mText.length()];
    this.mPaint.getTextWidths(this.mText, this.mTextWidths);
    for (float f : this.mTextWidths)
      if (f > this.mCharWidth)
        this.mCharWidth = f;
    ??? = new Rect();
    this.mPaint.getTextBounds(this.mText, 0, this.mText.length(), (Rect)???);
    this.mCharHeight = ((Rect)???).height();
    if (this.mVertical)
    {
      tokenizerVertical();
      AppMethodBeat.o(84294);
    }
    while (true)
    {
      return;
      tokenizeHorizontal();
      AppMethodBeat.o(84294);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.WMTokenizer
 * JD-Core Version:    0.6.2
 */
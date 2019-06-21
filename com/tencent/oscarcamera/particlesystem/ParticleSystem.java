package com.tencent.oscarcamera.particlesystem;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.LogUtils;
import com.tencent.util.i;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.DoubleBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

public class ParticleSystem
{
  private static final String TAG;
  private long mAdvanceIndex;
  private List<ParticleCloud> mClouds;
  private final Context mContext;
  private ArrayList<Particle> mCopiedParticles;
  double[] mParamsPool;
  final Particle mPool;
  private Random mRandom;
  private Map<Sprite, ParticleCloud> mSpriteMap;

  static
  {
    AppMethodBeat.i(81540);
    try
    {
      System.loadLibrary("ParticleSystem");
      TAG = ParticleSystem.class.getSimpleName();
      AppMethodBeat.o(81540);
      return;
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
      while (true)
        LogUtils.e(localUnsatisfiedLinkError);
    }
    catch (RuntimeException localRuntimeException)
    {
      while (true)
        LogUtils.e(localRuntimeException);
    }
    catch (Exception localException)
    {
      while (true)
        LogUtils.e(localException);
    }
  }

  public ParticleSystem(Context paramContext)
  {
    AppMethodBeat.i(81525);
    this.mRandom = new Random();
    this.mClouds = new ArrayList();
    this.mSpriteMap = new HashMap();
    this.mPool = new Particle();
    this.mAdvanceIndex = 0L;
    this.mCopiedParticles = new ArrayList();
    this.mContext = paramContext;
    AppMethodBeat.o(81525);
  }

  public static long compile(String paramString)
  {
    AppMethodBeat.i(81538);
    long l = nativeCompile(paramString);
    AppMethodBeat.o(81538);
    return l;
  }

  private void createCache(int paramInt)
  {
    AppMethodBeat.i(81533);
    this.mParamsPool = new double[paramInt * 11];
    for (int i = 0; i < paramInt; i++)
    {
      localObject = new Particle();
      ((Particle)localObject).param_offset = (i * 11);
      ((Particle)localObject).next = this.mPool.next;
      this.mPool.next = ((Particle)localObject);
      localObject = this.mPool;
      ((Particle)localObject).total += 1;
    }
    Object localObject = this.mClouds.iterator();
    while (((Iterator)localObject).hasNext())
      ((ParticleCloud)((Iterator)localObject).next()).createCache();
    AppMethodBeat.o(81533);
  }

  private void loadFinish()
  {
    AppMethodBeat.i(81532);
    Iterator localIterator = this.mClouds.iterator();
    ParticleCloud localParticleCloud;
    double d;
    for (int i = 0; localIterator.hasNext(); i = (int)(((Attribute)localParticleCloud.mAttrs.get("particleCountMax")).value() + d))
    {
      localParticleCloud = (ParticleCloud)localIterator.next();
      d = i;
    }
    createCache(i);
    AppMethodBeat.o(81532);
  }

  private void loadParticle(String paramString)
  {
    AppMethodBeat.i(81531);
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      paramString = localJSONObject;
      paramString = ParticleCloud.fromJson(this, paramString);
      this.mClouds.add(paramString);
      this.mSpriteMap.put(paramString.mSprite, paramString);
      AppMethodBeat.o(81531);
      return;
    }
    catch (JSONException paramString)
    {
      while (true)
      {
        i.m(TAG, paramString.getMessage());
        paramString = null;
      }
    }
  }

  public static native double[] nativeAdvance(long[] paramArrayOfLong, double[] paramArrayOfDouble, int[] paramArrayOfInt, int paramInt);

  public static native void nativeAdvanceEx(long[] paramArrayOfLong, double[] paramArrayOfDouble, int[] paramArrayOfInt, int paramInt, DoubleBuffer paramDoubleBuffer);

  public static native long nativeCompile(String paramString);

  public static native void nativeReleaseExpression(long[] paramArrayOfLong);

  private Particle obtainUnlocked()
  {
    AppMethodBeat.i(81527);
    if (this.mPool.next == null)
      for (int i = 100; i > 0; i--)
      {
        localParticle1 = new Particle();
        localParticle1.next = this.mPool.next;
        this.mPool.next = localParticle1;
        localParticle1 = this.mPool;
        localParticle1.total += 1;
      }
    Particle localParticle2 = this.mPool.next;
    this.mPool.next = localParticle2.next;
    localParticle2.next = null;
    Particle localParticle1 = this.mPool;
    localParticle1.total -= 1;
    AppMethodBeat.o(81527);
    return localParticle2;
  }

  public static void releaseExpression(long[] paramArrayOfLong)
  {
    AppMethodBeat.i(81539);
    nativeReleaseExpression(paramArrayOfLong);
    AppMethodBeat.o(81539);
  }

  public ArrayList<Particle> advance()
  {
    AppMethodBeat.i(81535);
    ArrayList localArrayList = new ArrayList();
    double d = System.currentTimeMillis() / 1000.0D;
    Iterator localIterator = this.mClouds.iterator();
    while (localIterator.hasNext())
    {
      ParticleCloud localParticleCloud = (ParticleCloud)localIterator.next();
      synchronized (this.mPool)
      {
        Pair localPair = localParticleCloud.getAdvanceExpression(d);
        nativeAdvanceEx(((ParticleExpressionBundle)localPair.second).expressions, this.mParamsPool, ((ParticleExpressionBundle)localPair.second).param_offsets, ((ParticleExpressionBundle)localPair.second).param_line, localParticleCloud.mResultBuffer);
        localParticleCloud.mResultBuffer.rewind();
        localParticleCloud.mResultBuffer.get(localParticleCloud.mResultArray);
        int i = localParticleCloud.mVarAttributes.length;
        for (int j = 0; j < i; j++)
        {
          Attribute localAttribute = localParticleCloud.mVarAttributes[j];
          int k = ((Particle)localPair.first).total;
          int m = 0;
          Particle localParticle2 = ((Particle)localPair.first).next;
          while (localParticle2 != null)
          {
            localParticle2.a[localAttribute.mVarIndex] = localParticleCloud.mResultArray[(j * k + m)];
            localParticle2 = localParticle2.next;
            m++;
          }
        }
        localArrayList.add(localPair.first);
      }
    }
    AppMethodBeat.o(81535);
    return localArrayList;
  }

  public ArrayList<Particle> advanceAsync()
  {
    AppMethodBeat.i(81536);
    this.mCopiedParticles.clear();
    synchronized (this.mPool)
    {
      Iterator localIterator = this.mClouds.iterator();
      while (localIterator.hasNext())
      {
        localObject1 = (ParticleCloud)localIterator.next();
        this.mCopiedParticles.add(((ParticleCloud)localObject1).mCopiedParticles);
        Particle localParticle2 = ((ParticleCloud)localObject1).mCopiedParticles;
        localObject1 = ((ParticleCloud)localObject1).mParticles;
        localParticle2.total = ((Particle)localObject1).total;
        while (((Particle)localObject1).next != null)
        {
          localParticle2.next.copy(((Particle)localObject1).next);
          localParticle2 = localParticle2.next;
          localObject1 = ((Particle)localObject1).next;
        }
      }
      Object localObject1 = this.mCopiedParticles;
      AppMethodBeat.o(81536);
      return localObject1;
    }
  }

  Particle advanceObtainUnlocked()
  {
    AppMethodBeat.i(81526);
    Particle localParticle = obtainUnlocked();
    for (int i = 0; i < 11; i++)
      this.mParamsPool[(localParticle.param_offset + i)] = Math.abs(this.mRandom.nextInt());
    AppMethodBeat.o(81526);
    return localParticle;
  }

  public void emitImmediately(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    AppMethodBeat.i(81530);
    Iterator localIterator = this.mClouds.iterator();
    ParticleCloud localParticleCloud;
    while (true)
      if (localIterator.hasNext())
      {
        localParticleCloud = (ParticleCloud)localIterator.next();
        if (localParticleCloud.mEmitRate == 0L)
          if (localParticleCloud.mParticles.total >= localParticleCloud.mMaxCount)
          {
            String.format("max: %d, now %d, can't emit any more", new Object[] { Long.valueOf(localParticleCloud.mMaxCount), Integer.valueOf(localParticleCloud.mParticles.total) });
            AppMethodBeat.o(81530);
          }
      }
    while (true)
    {
      return;
      localParticleCloud.emitImmediately(paramDouble1, paramDouble2, paramDouble3);
      break;
      AppMethodBeat.o(81530);
    }
  }

  protected void finalize()
  {
    AppMethodBeat.i(81537);
    super.finalize();
    Iterator localIterator = this.mClouds.iterator();
    while (localIterator.hasNext())
      ((ParticleCloud)localIterator.next()).release();
    AppMethodBeat.o(81537);
  }

  public List<Sprite> getSprites()
  {
    AppMethodBeat.i(81534);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.mClouds.iterator();
    while (localIterator.hasNext())
      localArrayList.add(((ParticleCloud)localIterator.next()).mSprite);
    AppMethodBeat.o(81534);
    return localArrayList;
  }

  public void loadParticleData(List<String> paramList)
  {
    AppMethodBeat.i(81528);
    if (paramList == null)
    {
      AppMethodBeat.o(81528);
      return;
    }
    ArrayList localArrayList = new ArrayList();
    while (true)
    {
      Object localObject1;
      try
      {
        paramList = paramList.iterator();
        if (paramList.hasNext())
        {
          localObject1 = (String)paramList.next();
          if (!((String)localObject1).startsWith("/"))
            break label167;
          localObject2 = new java/io/InputStreamReader;
          localObject3 = new java/io/FileInputStream;
          ((FileInputStream)localObject3).<init>((String)localObject1);
          ((InputStreamReader)localObject2).<init>((InputStream)localObject3);
          localObject3 = new java/io/BufferedReader;
          ((BufferedReader)localObject3).<init>((Reader)localObject2, 1024);
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject2 = ((BufferedReader)localObject3).readLine();
          if (localObject2 == null)
            break label153;
          ((StringBuilder)localObject1).append((String)localObject2);
          continue;
        }
      }
      catch (Exception paramList)
      {
        if (!localArrayList.isEmpty())
          loadParticles(localArrayList);
        AppMethodBeat.o(81528);
      }
      break;
      label153: localArrayList.add(((StringBuilder)localObject1).toString());
      continue;
      label167: Object localObject3 = this.mContext.getAssets().open((String)localObject1);
      Object localObject2 = new byte[((InputStream)localObject3).available()];
      ((InputStream)localObject3).read((byte[])localObject2);
      localObject3 = new java/lang/String;
      ((String)localObject3).<init>((byte[])localObject2);
      localArrayList.add(localObject3);
    }
  }

  public void loadParticles(List<String> paramList)
  {
    AppMethodBeat.i(81529);
    paramList = paramList.iterator();
    while (paramList.hasNext())
      loadParticle((String)paramList.next());
    loadFinish();
    AppMethodBeat.o(81529);
  }

  void putUnlocked(Particle paramParticle)
  {
    paramParticle.next = this.mPool.next;
    this.mPool.next = paramParticle;
    paramParticle = this.mPool;
    paramParticle.total += 1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.oscarcamera.particlesystem.ParticleSystem
 * JD-Core Version:    0.6.2
 */
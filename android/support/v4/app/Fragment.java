package android.support.v4.app;

import android.animation.Animator;
import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.LifecycleRegistry;
import android.arch.lifecycle.ViewModelStore;
import android.arch.lifecycle.ViewModelStoreOwner;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.f.d;
import android.support.v4.f.m;
import android.support.v4.view.e;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Fragment
  implements LifecycleOwner, ViewModelStoreOwner, ComponentCallbacks, View.OnCreateContextMenuListener
{
  static final int ACTIVITY_CREATED = 2;
  static final int CREATED = 1;
  static final int INITIALIZING = 0;
  static final int RESUMED = 5;
  static final int STARTED = 4;
  static final int STOPPED = 3;
  static final Object USE_DEFAULT_TRANSITION = new Object();
  private static final m<String, Class<?>> sClassMap = new m();
  boolean mAdded;
  a mAnimationInfo;
  Bundle mArguments;
  int mBackStackNesting;
  boolean mCalled;
  FragmentManagerImpl mChildFragmentManager;
  j mChildNonConfig;
  ViewGroup mContainer;
  int mContainerId;
  boolean mDeferStart;
  boolean mDetached;
  int mFragmentId;
  FragmentManagerImpl mFragmentManager;
  boolean mFromLayout;
  boolean mHasMenu;
  boolean mHidden;
  boolean mHiddenChanged;
  h mHost;
  boolean mInLayout;
  int mIndex = -1;
  View mInnerView;
  boolean mIsCreated;
  boolean mIsNewlyAdded;
  LayoutInflater mLayoutInflater;
  LifecycleRegistry mLifecycleRegistry = new LifecycleRegistry(this);
  s mLoaderManager;
  boolean mMenuVisible = true;
  Fragment mParentFragment;
  boolean mPerformedCreateView;
  float mPostponedAlpha;
  boolean mRemoving;
  boolean mRestored;
  boolean mRetainInstance;
  boolean mRetaining;
  Bundle mSavedFragmentState;
  Boolean mSavedUserVisibleHint;
  SparseArray<Parcelable> mSavedViewState;
  int mState = 0;
  String mTag;
  Fragment mTarget;
  int mTargetIndex = -1;
  int mTargetRequestCode;
  boolean mUserVisibleHint = true;
  View mView;
  ViewModelStore mViewModelStore;
  String mWho;

  private void callStartTransitionListener()
  {
    c localc = null;
    if (this.mAnimationInfo == null);
    while (true)
    {
      if (localc != null)
        localc.dk();
      return;
      this.mAnimationInfo.CO = false;
      localc = this.mAnimationInfo.CQ;
      this.mAnimationInfo.CQ = null;
    }
  }

  private a ensureAnimationInfo()
  {
    if (this.mAnimationInfo == null)
      this.mAnimationInfo = new a();
    return this.mAnimationInfo;
  }

  public static Fragment instantiate(Context paramContext, String paramString)
  {
    return instantiate(paramContext, paramString, null);
  }

  public static Fragment instantiate(Context paramContext, String paramString, Bundle paramBundle)
  {
    try
    {
      Class localClass1 = (Class)sClassMap.get(paramString);
      Class localClass2 = localClass1;
      if (localClass1 == null)
      {
        localClass2 = paramContext.getClassLoader().loadClass(paramString);
        sClassMap.put(paramString, localClass2);
      }
      paramContext = (Fragment)localClass2.getConstructor(new Class[0]).newInstance(new Object[0]);
      if (paramBundle != null)
      {
        paramBundle.setClassLoader(paramContext.getClass().getClassLoader());
        paramContext.setArguments(paramBundle);
      }
      return paramContext;
    }
    catch (ClassNotFoundException paramContext)
    {
      throw new b("Unable to instantiate fragment " + paramString + ": make sure class name exists, is public, and has an empty constructor that is public", paramContext);
    }
    catch (InstantiationException paramContext)
    {
      throw new b("Unable to instantiate fragment " + paramString + ": make sure class name exists, is public, and has an empty constructor that is public", paramContext);
    }
    catch (IllegalAccessException paramContext)
    {
      throw new b("Unable to instantiate fragment " + paramString + ": make sure class name exists, is public, and has an empty constructor that is public", paramContext);
    }
    catch (NoSuchMethodException paramContext)
    {
      throw new b("Unable to instantiate fragment " + paramString + ": could not find Fragment constructor", paramContext);
    }
    catch (InvocationTargetException paramContext)
    {
    }
    throw new b("Unable to instantiate fragment " + paramString + ": calling Fragment constructor caused an exception", paramContext);
  }

  static boolean isSupportFragmentClass(Context paramContext, String paramString)
  {
    try
    {
      Class localClass1 = (Class)sClassMap.get(paramString);
      Class localClass2 = localClass1;
      if (localClass1 == null)
      {
        localClass2 = paramContext.getClassLoader().loadClass(paramString);
        sClassMap.put(paramString, localClass2);
      }
      bool = Fragment.class.isAssignableFrom(localClass2);
      return bool;
    }
    catch (ClassNotFoundException paramContext)
    {
      while (true)
        boolean bool = false;
    }
  }

  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mFragmentId=#");
    paramPrintWriter.print(Integer.toHexString(this.mFragmentId));
    paramPrintWriter.print(" mContainerId=#");
    paramPrintWriter.print(Integer.toHexString(this.mContainerId));
    paramPrintWriter.print(" mTag=");
    paramPrintWriter.println(this.mTag);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mState=");
    paramPrintWriter.print(this.mState);
    paramPrintWriter.print(" mIndex=");
    paramPrintWriter.print(this.mIndex);
    paramPrintWriter.print(" mWho=");
    paramPrintWriter.print(this.mWho);
    paramPrintWriter.print(" mBackStackNesting=");
    paramPrintWriter.println(this.mBackStackNesting);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mAdded=");
    paramPrintWriter.print(this.mAdded);
    paramPrintWriter.print(" mRemoving=");
    paramPrintWriter.print(this.mRemoving);
    paramPrintWriter.print(" mFromLayout=");
    paramPrintWriter.print(this.mFromLayout);
    paramPrintWriter.print(" mInLayout=");
    paramPrintWriter.println(this.mInLayout);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mHidden=");
    paramPrintWriter.print(this.mHidden);
    paramPrintWriter.print(" mDetached=");
    paramPrintWriter.print(this.mDetached);
    paramPrintWriter.print(" mMenuVisible=");
    paramPrintWriter.print(this.mMenuVisible);
    paramPrintWriter.print(" mHasMenu=");
    paramPrintWriter.println(this.mHasMenu);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mRetainInstance=");
    paramPrintWriter.print(this.mRetainInstance);
    paramPrintWriter.print(" mRetaining=");
    paramPrintWriter.print(this.mRetaining);
    paramPrintWriter.print(" mUserVisibleHint=");
    paramPrintWriter.println(this.mUserVisibleHint);
    if (this.mFragmentManager != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mFragmentManager=");
      paramPrintWriter.println(this.mFragmentManager);
    }
    if (this.mHost != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mHost=");
      paramPrintWriter.println(this.mHost);
    }
    if (this.mParentFragment != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mParentFragment=");
      paramPrintWriter.println(this.mParentFragment);
    }
    if (this.mArguments != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mArguments=");
      paramPrintWriter.println(this.mArguments);
    }
    if (this.mSavedFragmentState != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mSavedFragmentState=");
      paramPrintWriter.println(this.mSavedFragmentState);
    }
    if (this.mSavedViewState != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mSavedViewState=");
      paramPrintWriter.println(this.mSavedViewState);
    }
    if (this.mTarget != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mTarget=");
      paramPrintWriter.print(this.mTarget);
      paramPrintWriter.print(" mTargetRequestCode=");
      paramPrintWriter.println(this.mTargetRequestCode);
    }
    if (getNextAnim() != 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mNextAnim=");
      paramPrintWriter.println(getNextAnim());
    }
    if (this.mContainer != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mContainer=");
      paramPrintWriter.println(this.mContainer);
    }
    if (this.mView != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mView=");
      paramPrintWriter.println(this.mView);
    }
    if (this.mInnerView != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mInnerView=");
      paramPrintWriter.println(this.mView);
    }
    if (getAnimatingAway() != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mAnimatingAway=");
      paramPrintWriter.println(getAnimatingAway());
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mStateAfterAnimating=");
      paramPrintWriter.println(getStateAfterAnimating());
    }
    if (this.mLoaderManager != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Loader Manager:");
      this.mLoaderManager.dump(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
    if (this.mChildFragmentManager != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Child " + this.mChildFragmentManager + ":");
      this.mChildFragmentManager.dump(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }

  public final boolean equals(Object paramObject)
  {
    return super.equals(paramObject);
  }

  Fragment findFragmentByWho(String paramString)
  {
    if (paramString.equals(this.mWho))
      paramString = this;
    while (true)
    {
      return paramString;
      if (this.mChildFragmentManager != null)
        paramString = this.mChildFragmentManager.findFragmentByWho(paramString);
      else
        paramString = null;
    }
  }

  public final FragmentActivity getActivity()
  {
    if (this.mHost == null);
    for (FragmentActivity localFragmentActivity = null; ; localFragmentActivity = (FragmentActivity)this.mHost.mActivity)
      return localFragmentActivity;
  }

  public boolean getAllowEnterTransitionOverlap()
  {
    if ((this.mAnimationInfo == null) || (this.mAnimationInfo.CL == null));
    for (boolean bool = true; ; bool = this.mAnimationInfo.CL.booleanValue())
      return bool;
  }

  public boolean getAllowReturnTransitionOverlap()
  {
    if ((this.mAnimationInfo == null) || (this.mAnimationInfo.CK == null));
    for (boolean bool = true; ; bool = this.mAnimationInfo.CK.booleanValue())
      return bool;
  }

  View getAnimatingAway()
  {
    if (this.mAnimationInfo == null);
    for (View localView = null; ; localView = this.mAnimationInfo.Cy)
      return localView;
  }

  Animator getAnimator()
  {
    if (this.mAnimationInfo == null);
    for (Animator localAnimator = null; ; localAnimator = this.mAnimationInfo.Cz)
      return localAnimator;
  }

  public final Bundle getArguments()
  {
    return this.mArguments;
  }

  public final i getChildFragmentManager()
  {
    if (this.mChildFragmentManager == null)
    {
      instantiateChildFragmentManager();
      if (this.mState < 5)
        break label31;
      this.mChildFragmentManager.dispatchResume();
    }
    while (true)
    {
      return this.mChildFragmentManager;
      label31: if (this.mState >= 4)
        this.mChildFragmentManager.dispatchStart();
      else if (this.mState >= 2)
        this.mChildFragmentManager.dispatchActivityCreated();
      else if (this.mState > 0)
        this.mChildFragmentManager.dispatchCreate();
    }
  }

  public Context getContext()
  {
    if (this.mHost == null);
    for (Context localContext = null; ; localContext = this.mHost.mContext)
      return localContext;
  }

  public Object getEnterTransition()
  {
    if (this.mAnimationInfo == null);
    for (Object localObject = null; ; localObject = this.mAnimationInfo.CE)
      return localObject;
  }

  ac getEnterTransitionCallback()
  {
    if (this.mAnimationInfo == null);
    for (ac localac = null; ; localac = this.mAnimationInfo.CM)
      return localac;
  }

  public Object getExitTransition()
  {
    if (this.mAnimationInfo == null);
    for (Object localObject = null; ; localObject = this.mAnimationInfo.CG)
      return localObject;
  }

  ac getExitTransitionCallback()
  {
    if (this.mAnimationInfo == null);
    for (ac localac = null; ; localac = this.mAnimationInfo.CN)
      return localac;
  }

  public final i getFragmentManager()
  {
    return this.mFragmentManager;
  }

  public final Object getHost()
  {
    if (this.mHost == null);
    for (Object localObject = null; ; localObject = this.mHost.onGetHost())
      return localObject;
  }

  public final int getId()
  {
    return this.mFragmentId;
  }

  public final LayoutInflater getLayoutInflater()
  {
    if (this.mLayoutInflater == null);
    for (LayoutInflater localLayoutInflater = performGetLayoutInflater(null); ; localLayoutInflater = this.mLayoutInflater)
      return localLayoutInflater;
  }

  @Deprecated
  public LayoutInflater getLayoutInflater(Bundle paramBundle)
  {
    if (this.mHost == null)
      throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    paramBundle = this.mHost.onGetLayoutInflater();
    getChildFragmentManager();
    e.b(paramBundle, this.mChildFragmentManager.getLayoutInflaterFactory());
    return paramBundle;
  }

  public Lifecycle getLifecycle()
  {
    return this.mLifecycleRegistry;
  }

  public r getLoaderManager()
  {
    if (this.mLoaderManager != null);
    for (s locals = this.mLoaderManager; ; locals = this.mLoaderManager)
    {
      return locals;
      this.mLoaderManager = new s(this, getViewModelStore());
    }
  }

  int getNextAnim()
  {
    if (this.mAnimationInfo == null);
    for (int i = 0; ; i = this.mAnimationInfo.CB)
      return i;
  }

  int getNextTransition()
  {
    if (this.mAnimationInfo == null);
    for (int i = 0; ; i = this.mAnimationInfo.CC)
      return i;
  }

  int getNextTransitionStyle()
  {
    if (this.mAnimationInfo == null);
    for (int i = 0; ; i = this.mAnimationInfo.CD)
      return i;
  }

  public final Fragment getParentFragment()
  {
    return this.mParentFragment;
  }

  public Object getReenterTransition()
  {
    Object localObject;
    if (this.mAnimationInfo == null)
      localObject = null;
    while (true)
    {
      return localObject;
      if (this.mAnimationInfo.CH == USE_DEFAULT_TRANSITION)
        localObject = getExitTransition();
      else
        localObject = this.mAnimationInfo.CH;
    }
  }

  public final Resources getResources()
  {
    return requireContext().getResources();
  }

  public final boolean getRetainInstance()
  {
    return this.mRetainInstance;
  }

  public Object getReturnTransition()
  {
    Object localObject;
    if (this.mAnimationInfo == null)
      localObject = null;
    while (true)
    {
      return localObject;
      if (this.mAnimationInfo.CF == USE_DEFAULT_TRANSITION)
        localObject = getEnterTransition();
      else
        localObject = this.mAnimationInfo.CF;
    }
  }

  public Object getSharedElementEnterTransition()
  {
    if (this.mAnimationInfo == null);
    for (Object localObject = null; ; localObject = this.mAnimationInfo.CI)
      return localObject;
  }

  public Object getSharedElementReturnTransition()
  {
    Object localObject;
    if (this.mAnimationInfo == null)
      localObject = null;
    while (true)
    {
      return localObject;
      if (this.mAnimationInfo.CJ == USE_DEFAULT_TRANSITION)
        localObject = getSharedElementEnterTransition();
      else
        localObject = this.mAnimationInfo.CJ;
    }
  }

  int getStateAfterAnimating()
  {
    if (this.mAnimationInfo == null);
    for (int i = 0; ; i = this.mAnimationInfo.CA)
      return i;
  }

  public final String getString(int paramInt)
  {
    return getResources().getString(paramInt);
  }

  public final String getString(int paramInt, Object[] paramArrayOfObject)
  {
    return getResources().getString(paramInt, paramArrayOfObject);
  }

  public final String getTag()
  {
    return this.mTag;
  }

  public final Fragment getTargetFragment()
  {
    return this.mTarget;
  }

  public final int getTargetRequestCode()
  {
    return this.mTargetRequestCode;
  }

  public final CharSequence getText(int paramInt)
  {
    return getResources().getText(paramInt);
  }

  public boolean getUserVisibleHint()
  {
    return this.mUserVisibleHint;
  }

  public View getView()
  {
    return this.mView;
  }

  public ViewModelStore getViewModelStore()
  {
    if (getContext() == null)
      throw new IllegalStateException("Can't access ViewModels from detached fragment");
    if (this.mViewModelStore == null)
      this.mViewModelStore = new ViewModelStore();
    return this.mViewModelStore;
  }

  public final boolean hasOptionsMenu()
  {
    return this.mHasMenu;
  }

  public final int hashCode()
  {
    return super.hashCode();
  }

  void initState()
  {
    this.mIndex = -1;
    this.mWho = null;
    this.mAdded = false;
    this.mRemoving = false;
    this.mFromLayout = false;
    this.mInLayout = false;
    this.mRestored = false;
    this.mBackStackNesting = 0;
    this.mFragmentManager = null;
    this.mChildFragmentManager = null;
    this.mHost = null;
    this.mFragmentId = 0;
    this.mContainerId = 0;
    this.mTag = null;
    this.mHidden = false;
    this.mDetached = false;
    this.mRetaining = false;
  }

  void instantiateChildFragmentManager()
  {
    if (this.mHost == null)
      throw new IllegalStateException("Fragment has not been attached yet.");
    this.mChildFragmentManager = new FragmentManagerImpl();
    this.mChildFragmentManager.attachController(this.mHost, new f()
    {
      public final Fragment instantiate(Context paramAnonymousContext, String paramAnonymousString, Bundle paramAnonymousBundle)
      {
        return Fragment.this.mHost.instantiate(paramAnonymousContext, paramAnonymousString, paramAnonymousBundle);
      }

      public final View onFindViewById(int paramAnonymousInt)
      {
        if (Fragment.this.mView == null)
          throw new IllegalStateException("Fragment does not have a view");
        return Fragment.this.mView.findViewById(paramAnonymousInt);
      }

      public final boolean onHasView()
      {
        if (Fragment.this.mView != null);
        for (boolean bool = true; ; bool = false)
          return bool;
      }
    }
    , this);
  }

  public final boolean isAdded()
  {
    if ((this.mHost != null) && (this.mAdded));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean isDetached()
  {
    return this.mDetached;
  }

  public final boolean isHidden()
  {
    return this.mHidden;
  }

  boolean isHideReplaced()
  {
    if (this.mAnimationInfo == null);
    for (boolean bool = false; ; bool = this.mAnimationInfo.CR)
      return bool;
  }

  final boolean isInBackStack()
  {
    if (this.mBackStackNesting > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean isInLayout()
  {
    return this.mInLayout;
  }

  public final boolean isMenuVisible()
  {
    return this.mMenuVisible;
  }

  boolean isPostponed()
  {
    if (this.mAnimationInfo == null);
    for (boolean bool = false; ; bool = this.mAnimationInfo.CO)
      return bool;
  }

  public final boolean isRemoving()
  {
    return this.mRemoving;
  }

  public final boolean isResumed()
  {
    if (this.mState >= 5);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean isStateSaved()
  {
    if (this.mFragmentManager == null);
    for (boolean bool = false; ; bool = this.mFragmentManager.isStateSaved())
      return bool;
  }

  public final boolean isVisible()
  {
    if ((isAdded()) && (!isHidden()) && (this.mView != null) && (this.mView.getWindowToken() != null) && (this.mView.getVisibility() == 0));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  void noteStateNotSaved()
  {
    if (this.mChildFragmentManager != null)
      this.mChildFragmentManager.noteStateNotSaved();
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    this.mCalled = true;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
  }

  @Deprecated
  public void onAttach(Activity paramActivity)
  {
    this.mCalled = true;
  }

  public void onAttach(Context paramContext)
  {
    this.mCalled = true;
    if (this.mHost == null);
    for (paramContext = null; ; paramContext = this.mHost.mActivity)
    {
      if (paramContext != null)
      {
        this.mCalled = false;
        onAttach(paramContext);
      }
      return;
    }
  }

  public void onAttachFragment(Fragment paramFragment)
  {
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    this.mCalled = true;
  }

  public boolean onContextItemSelected(MenuItem paramMenuItem)
  {
    return false;
  }

  public void onCreate(Bundle paramBundle)
  {
    this.mCalled = true;
    restoreChildFragmentState(paramBundle);
    if ((this.mChildFragmentManager != null) && (!this.mChildFragmentManager.isStateAtLeast(1)))
      this.mChildFragmentManager.dispatchCreate();
  }

  public Animation onCreateAnimation(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    return null;
  }

  public Animator onCreateAnimator(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    return null;
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    getActivity().onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
  }

  public void onCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater)
  {
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return null;
  }

  public void onDestroy()
  {
    this.mCalled = true;
    if ((this.mViewModelStore != null) && (!this.mHost.mFragmentManager.mStateSaved))
      this.mViewModelStore.clear();
  }

  public void onDestroyOptionsMenu()
  {
  }

  public void onDestroyView()
  {
    this.mCalled = true;
  }

  public void onDetach()
  {
    this.mCalled = true;
  }

  public LayoutInflater onGetLayoutInflater(Bundle paramBundle)
  {
    return getLayoutInflater(paramBundle);
  }

  public void onHiddenChanged(boolean paramBoolean)
  {
  }

  @Deprecated
  public void onInflate(Activity paramActivity, AttributeSet paramAttributeSet, Bundle paramBundle)
  {
    this.mCalled = true;
  }

  public void onInflate(Context paramContext, AttributeSet paramAttributeSet, Bundle paramBundle)
  {
    this.mCalled = true;
    if (this.mHost == null);
    for (paramContext = null; ; paramContext = this.mHost.mActivity)
    {
      if (paramContext != null)
      {
        this.mCalled = false;
        onInflate(paramContext, paramAttributeSet, paramBundle);
      }
      return;
    }
  }

  public void onLowMemory()
  {
    this.mCalled = true;
  }

  public void onMultiWindowModeChanged(boolean paramBoolean)
  {
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    return false;
  }

  public void onOptionsMenuClosed(Menu paramMenu)
  {
  }

  public void onPause()
  {
    this.mCalled = true;
  }

  public void onPictureInPictureModeChanged(boolean paramBoolean)
  {
  }

  public void onPrepareOptionsMenu(Menu paramMenu)
  {
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
  }

  public void onResume()
  {
    this.mCalled = true;
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
  }

  public void onStart()
  {
    this.mCalled = true;
  }

  public void onStop()
  {
    this.mCalled = true;
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
  }

  public void onViewStateRestored(Bundle paramBundle)
  {
    this.mCalled = true;
  }

  i peekChildFragmentManager()
  {
    return this.mChildFragmentManager;
  }

  void performActivityCreated(Bundle paramBundle)
  {
    if (this.mChildFragmentManager != null)
      this.mChildFragmentManager.noteStateNotSaved();
    this.mState = 2;
    this.mCalled = false;
    onActivityCreated(paramBundle);
    if (!this.mCalled)
      throw new ad("Fragment " + this + " did not call through to super.onActivityCreated()");
    if (this.mChildFragmentManager != null)
      this.mChildFragmentManager.dispatchActivityCreated();
  }

  void performConfigurationChanged(Configuration paramConfiguration)
  {
    onConfigurationChanged(paramConfiguration);
    if (this.mChildFragmentManager != null)
      this.mChildFragmentManager.dispatchConfigurationChanged(paramConfiguration);
  }

  boolean performContextItemSelected(MenuItem paramMenuItem)
  {
    boolean bool = true;
    if (!this.mHidden)
      if (!onContextItemSelected(paramMenuItem));
    while (true)
    {
      return bool;
      if ((this.mChildFragmentManager == null) || (!this.mChildFragmentManager.dispatchContextItemSelected(paramMenuItem)))
        bool = false;
    }
  }

  void performCreate(Bundle paramBundle)
  {
    if (this.mChildFragmentManager != null)
      this.mChildFragmentManager.noteStateNotSaved();
    this.mState = 1;
    this.mCalled = false;
    onCreate(paramBundle);
    this.mIsCreated = true;
    if (!this.mCalled)
      throw new ad("Fragment " + this + " did not call through to super.onCreate()");
    this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
  }

  boolean performCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    if (!this.mHidden)
    {
      boolean bool3 = bool2;
      if (this.mHasMenu)
      {
        bool3 = bool2;
        if (this.mMenuVisible)
        {
          bool3 = true;
          onCreateOptionsMenu(paramMenu, paramMenuInflater);
        }
      }
      bool1 = bool3;
      if (this.mChildFragmentManager != null)
        bool1 = bool3 | this.mChildFragmentManager.dispatchCreateOptionsMenu(paramMenu, paramMenuInflater);
    }
    return bool1;
  }

  View performCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    if (this.mChildFragmentManager != null)
      this.mChildFragmentManager.noteStateNotSaved();
    this.mPerformedCreateView = true;
    return onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
  }

  void performDestroy()
  {
    this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    if (this.mChildFragmentManager != null)
      this.mChildFragmentManager.dispatchDestroy();
    this.mState = 0;
    this.mCalled = false;
    this.mIsCreated = false;
    onDestroy();
    if (!this.mCalled)
      throw new ad("Fragment " + this + " did not call through to super.onDestroy()");
    this.mChildFragmentManager = null;
  }

  void performDestroyView()
  {
    if (this.mChildFragmentManager != null)
      this.mChildFragmentManager.dispatchDestroyView();
    this.mState = 1;
    this.mCalled = false;
    onDestroyView();
    if (!this.mCalled)
      throw new ad("Fragment " + this + " did not call through to super.onDestroyView()");
    if (this.mLoaderManager != null)
      this.mLoaderManager.Er.dr();
    this.mPerformedCreateView = false;
  }

  void performDetach()
  {
    this.mCalled = false;
    onDetach();
    this.mLayoutInflater = null;
    if (!this.mCalled)
      throw new ad("Fragment " + this + " did not call through to super.onDetach()");
    if (this.mChildFragmentManager != null)
    {
      if (!this.mRetaining)
        throw new IllegalStateException("Child FragmentManager of " + this + " was not  destroyed and this fragment is not retaining instance");
      this.mChildFragmentManager.dispatchDestroy();
      this.mChildFragmentManager = null;
    }
  }

  LayoutInflater performGetLayoutInflater(Bundle paramBundle)
  {
    this.mLayoutInflater = onGetLayoutInflater(paramBundle);
    return this.mLayoutInflater;
  }

  void performLowMemory()
  {
    onLowMemory();
    if (this.mChildFragmentManager != null)
      this.mChildFragmentManager.dispatchLowMemory();
  }

  void performMultiWindowModeChanged(boolean paramBoolean)
  {
    onMultiWindowModeChanged(paramBoolean);
    if (this.mChildFragmentManager != null)
      this.mChildFragmentManager.dispatchMultiWindowModeChanged(paramBoolean);
  }

  boolean performOptionsItemSelected(MenuItem paramMenuItem)
  {
    boolean bool = true;
    if (!this.mHidden)
      if ((!this.mHasMenu) || (!this.mMenuVisible) || (!onOptionsItemSelected(paramMenuItem)));
    while (true)
    {
      return bool;
      if ((this.mChildFragmentManager == null) || (!this.mChildFragmentManager.dispatchOptionsItemSelected(paramMenuItem)))
        bool = false;
    }
  }

  void performOptionsMenuClosed(Menu paramMenu)
  {
    if (!this.mHidden)
    {
      if ((this.mHasMenu) && (this.mMenuVisible))
        onOptionsMenuClosed(paramMenu);
      if (this.mChildFragmentManager != null)
        this.mChildFragmentManager.dispatchOptionsMenuClosed(paramMenu);
    }
  }

  void performPause()
  {
    this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    if (this.mChildFragmentManager != null)
      this.mChildFragmentManager.dispatchPause();
    this.mState = 4;
    this.mCalled = false;
    onPause();
    if (!this.mCalled)
      throw new ad("Fragment " + this + " did not call through to super.onPause()");
  }

  void performPictureInPictureModeChanged(boolean paramBoolean)
  {
    onPictureInPictureModeChanged(paramBoolean);
    if (this.mChildFragmentManager != null)
      this.mChildFragmentManager.dispatchPictureInPictureModeChanged(paramBoolean);
  }

  boolean performPrepareOptionsMenu(Menu paramMenu)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    if (!this.mHidden)
    {
      boolean bool3 = bool2;
      if (this.mHasMenu)
      {
        bool3 = bool2;
        if (this.mMenuVisible)
        {
          bool3 = true;
          onPrepareOptionsMenu(paramMenu);
        }
      }
      bool1 = bool3;
      if (this.mChildFragmentManager != null)
        bool1 = bool3 | this.mChildFragmentManager.dispatchPrepareOptionsMenu(paramMenu);
    }
    return bool1;
  }

  void performReallyStop()
  {
    if (this.mChildFragmentManager != null)
      this.mChildFragmentManager.dispatchReallyStop();
    this.mState = 2;
  }

  void performResume()
  {
    if (this.mChildFragmentManager != null)
    {
      this.mChildFragmentManager.noteStateNotSaved();
      this.mChildFragmentManager.execPendingActions();
    }
    this.mState = 5;
    this.mCalled = false;
    onResume();
    if (!this.mCalled)
      throw new ad("Fragment " + this + " did not call through to super.onResume()");
    if (this.mChildFragmentManager != null)
    {
      this.mChildFragmentManager.dispatchResume();
      this.mChildFragmentManager.execPendingActions();
    }
    this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
  }

  void performSaveInstanceState(Bundle paramBundle)
  {
    onSaveInstanceState(paramBundle);
    if (this.mChildFragmentManager != null)
    {
      Parcelable localParcelable = this.mChildFragmentManager.saveAllState();
      if (localParcelable != null)
        paramBundle.putParcelable("android:support:fragments", localParcelable);
    }
  }

  void performStart()
  {
    if (this.mChildFragmentManager != null)
    {
      this.mChildFragmentManager.noteStateNotSaved();
      this.mChildFragmentManager.execPendingActions();
    }
    this.mState = 4;
    this.mCalled = false;
    onStart();
    if (!this.mCalled)
      throw new ad("Fragment " + this + " did not call through to super.onStart()");
    if (this.mChildFragmentManager != null)
      this.mChildFragmentManager.dispatchStart();
    this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
  }

  void performStop()
  {
    this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    if (this.mChildFragmentManager != null)
      this.mChildFragmentManager.dispatchStop();
    this.mState = 3;
    this.mCalled = false;
    onStop();
    if (!this.mCalled)
      throw new ad("Fragment " + this + " did not call through to super.onStop()");
  }

  public void postponeEnterTransition()
  {
    ensureAnimationInfo().CO = true;
  }

  public void registerForContextMenu(View paramView)
  {
    paramView.setOnCreateContextMenuListener(this);
  }

  public final void requestPermissions(String[] paramArrayOfString, int paramInt)
  {
    if (this.mHost == null)
      throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    this.mHost.a(this, paramArrayOfString, paramInt);
  }

  public final FragmentActivity requireActivity()
  {
    FragmentActivity localFragmentActivity = getActivity();
    if (localFragmentActivity == null)
      throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    return localFragmentActivity;
  }

  public final Context requireContext()
  {
    Context localContext = getContext();
    if (localContext == null)
      throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    return localContext;
  }

  public final i requireFragmentManager()
  {
    i locali = getFragmentManager();
    if (locali == null)
      throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    return locali;
  }

  public final Object requireHost()
  {
    Object localObject = getHost();
    if (localObject == null)
      throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    return localObject;
  }

  void restoreChildFragmentState(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      paramBundle = paramBundle.getParcelable("android:support:fragments");
      if (paramBundle != null)
      {
        if (this.mChildFragmentManager == null)
          instantiateChildFragmentManager();
        this.mChildFragmentManager.restoreAllState(paramBundle, this.mChildNonConfig);
        this.mChildNonConfig = null;
        this.mChildFragmentManager.dispatchCreate();
      }
    }
  }

  final void restoreViewState(Bundle paramBundle)
  {
    if (this.mSavedViewState != null)
    {
      this.mInnerView.restoreHierarchyState(this.mSavedViewState);
      this.mSavedViewState = null;
    }
    this.mCalled = false;
    onViewStateRestored(paramBundle);
    if (!this.mCalled)
      throw new ad("Fragment " + this + " did not call through to super.onViewStateRestored()");
  }

  public void setAllowEnterTransitionOverlap(boolean paramBoolean)
  {
    ensureAnimationInfo().CL = Boolean.valueOf(paramBoolean);
  }

  public void setAllowReturnTransitionOverlap(boolean paramBoolean)
  {
    ensureAnimationInfo().CK = Boolean.valueOf(paramBoolean);
  }

  void setAnimatingAway(View paramView)
  {
    ensureAnimationInfo().Cy = paramView;
  }

  void setAnimator(Animator paramAnimator)
  {
    ensureAnimationInfo().Cz = paramAnimator;
  }

  public void setArguments(Bundle paramBundle)
  {
    if ((this.mIndex >= 0) && (isStateSaved()))
      throw new IllegalStateException("Fragment already active and state has been saved");
    this.mArguments = paramBundle;
  }

  public void setEnterSharedElementCallback(ac paramac)
  {
    ensureAnimationInfo().CM = paramac;
  }

  public void setEnterTransition(Object paramObject)
  {
    ensureAnimationInfo().CE = paramObject;
  }

  public void setExitSharedElementCallback(ac paramac)
  {
    ensureAnimationInfo().CN = paramac;
  }

  public void setExitTransition(Object paramObject)
  {
    ensureAnimationInfo().CG = paramObject;
  }

  public void setHasOptionsMenu(boolean paramBoolean)
  {
    if (this.mHasMenu != paramBoolean)
    {
      this.mHasMenu = paramBoolean;
      if ((isAdded()) && (!isHidden()))
        this.mHost.dm();
    }
  }

  void setHideReplaced(boolean paramBoolean)
  {
    ensureAnimationInfo().CR = paramBoolean;
  }

  final void setIndex(int paramInt, Fragment paramFragment)
  {
    this.mIndex = paramInt;
    if (paramFragment != null);
    for (this.mWho = (paramFragment.mWho + ":" + this.mIndex); ; this.mWho = ("android:fragment:" + this.mIndex))
      return;
  }

  public void setInitialSavedState(SavedState paramSavedState)
  {
    if (this.mIndex >= 0)
      throw new IllegalStateException("Fragment already active");
    if ((paramSavedState != null) && (paramSavedState.CS != null));
    for (paramSavedState = paramSavedState.CS; ; paramSavedState = null)
    {
      this.mSavedFragmentState = paramSavedState;
      return;
    }
  }

  public void setMenuVisibility(boolean paramBoolean)
  {
    if (this.mMenuVisible != paramBoolean)
    {
      this.mMenuVisible = paramBoolean;
      if ((this.mHasMenu) && (isAdded()) && (!isHidden()))
        this.mHost.dm();
    }
  }

  void setNextAnim(int paramInt)
  {
    if ((this.mAnimationInfo == null) && (paramInt == 0));
    while (true)
    {
      return;
      ensureAnimationInfo().CB = paramInt;
    }
  }

  void setNextTransition(int paramInt1, int paramInt2)
  {
    if ((this.mAnimationInfo == null) && (paramInt1 == 0) && (paramInt2 == 0));
    while (true)
    {
      return;
      ensureAnimationInfo();
      this.mAnimationInfo.CC = paramInt1;
      this.mAnimationInfo.CD = paramInt2;
    }
  }

  void setOnStartEnterTransitionListener(c paramc)
  {
    ensureAnimationInfo();
    if (paramc == this.mAnimationInfo.CQ);
    while (true)
    {
      return;
      if ((paramc != null) && (this.mAnimationInfo.CQ != null))
        throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on ".concat(String.valueOf(this)));
      if (this.mAnimationInfo.CO)
        this.mAnimationInfo.CQ = paramc;
      if (paramc != null)
        paramc.startListening();
    }
  }

  public void setReenterTransition(Object paramObject)
  {
    ensureAnimationInfo().CH = paramObject;
  }

  public void setRetainInstance(boolean paramBoolean)
  {
    this.mRetainInstance = paramBoolean;
  }

  public void setReturnTransition(Object paramObject)
  {
    ensureAnimationInfo().CF = paramObject;
  }

  public void setSharedElementEnterTransition(Object paramObject)
  {
    ensureAnimationInfo().CI = paramObject;
  }

  public void setSharedElementReturnTransition(Object paramObject)
  {
    ensureAnimationInfo().CJ = paramObject;
  }

  void setStateAfterAnimating(int paramInt)
  {
    ensureAnimationInfo().CA = paramInt;
  }

  public void setTargetFragment(Fragment paramFragment, int paramInt)
  {
    i locali = getFragmentManager();
    if (paramFragment != null);
    for (Object localObject = paramFragment.getFragmentManager(); (locali != null) && (localObject != null) && (locali != localObject); localObject = null)
      throw new IllegalArgumentException("Fragment " + paramFragment + " must share the same FragmentManager to be set as a target fragment");
    for (localObject = paramFragment; localObject != null; localObject = ((Fragment)localObject).getTargetFragment())
      if (localObject == this)
        throw new IllegalArgumentException("Setting " + paramFragment + " as the target of " + this + " would create a target cycle");
    this.mTarget = paramFragment;
    this.mTargetRequestCode = paramInt;
  }

  public void setUserVisibleHint(boolean paramBoolean)
  {
    if ((!this.mUserVisibleHint) && (paramBoolean) && (this.mState < 4) && (this.mFragmentManager != null) && (isAdded()))
      this.mFragmentManager.performPendingDeferredStart(this);
    this.mUserVisibleHint = paramBoolean;
    if ((this.mState < 4) && (!paramBoolean));
    for (paramBoolean = true; ; paramBoolean = false)
    {
      this.mDeferStart = paramBoolean;
      if (this.mSavedFragmentState != null)
        this.mSavedUserVisibleHint = Boolean.valueOf(this.mUserVisibleHint);
      return;
    }
  }

  public boolean shouldShowRequestPermissionRationale(String paramString)
  {
    if (this.mHost != null);
    for (boolean bool = this.mHost.H(paramString); ; bool = false)
      return bool;
  }

  public void startActivity(Intent paramIntent)
  {
    startActivity(paramIntent, null);
  }

  public void startActivity(Intent paramIntent, Bundle paramBundle)
  {
    if (this.mHost == null)
      throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    this.mHost.a(this, paramIntent, -1, paramBundle);
  }

  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    startActivityForResult(paramIntent, paramInt, null);
  }

  public void startActivityForResult(Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    if (this.mHost == null)
      throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    this.mHost.a(this, paramIntent, paramInt, paramBundle);
  }

  public void startIntentSenderForResult(IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, Bundle paramBundle)
  {
    if (this.mHost == null)
      throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    this.mHost.a(this, paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
  }

  public void startPostponedEnterTransition()
  {
    if ((this.mFragmentManager == null) || (this.mFragmentManager.mHost == null))
      ensureAnimationInfo().CO = false;
    while (true)
    {
      return;
      if (Looper.myLooper() != this.mFragmentManager.mHost.mHandler.getLooper())
        this.mFragmentManager.mHost.mHandler.postAtFrontOfQueue(new Runnable()
        {
          public final void run()
          {
            Fragment.this.callStartTransitionListener();
          }
        });
      else
        callStartTransitionListener();
    }
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    d.a(this, localStringBuilder);
    if (this.mIndex >= 0)
    {
      localStringBuilder.append(" #");
      localStringBuilder.append(this.mIndex);
    }
    if (this.mFragmentId != 0)
    {
      localStringBuilder.append(" id=0x");
      localStringBuilder.append(Integer.toHexString(this.mFragmentId));
    }
    if (this.mTag != null)
    {
      localStringBuilder.append(" ");
      localStringBuilder.append(this.mTag);
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }

  public void unregisterForContextMenu(View paramView)
  {
    paramView.setOnCreateContextMenuListener(null);
  }

  public static class SavedState
    implements Parcelable
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator()
    {
    };
    final Bundle CS;

    SavedState(Bundle paramBundle)
    {
      this.CS = paramBundle;
    }

    SavedState(Parcel paramParcel)
    {
      this.CS = paramParcel.readBundle();
    }

    public int describeContents()
    {
      return 0;
    }

    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeBundle(this.CS);
    }
  }

  static final class a
  {
    int CA;
    int CB;
    int CC;
    int CD;
    Object CE = null;
    Object CF = Fragment.USE_DEFAULT_TRANSITION;
    Object CG = null;
    Object CH = Fragment.USE_DEFAULT_TRANSITION;
    Object CI = null;
    Object CJ = Fragment.USE_DEFAULT_TRANSITION;
    Boolean CK;
    Boolean CL;
    ac CM = null;
    ac CN = null;
    boolean CO;
    Fragment.c CQ;
    boolean CR;
    View Cy;
    Animator Cz;
  }

  public static final class b extends RuntimeException
  {
    public b(String paramString, Exception paramException)
    {
      super(paramException);
    }
  }

  static abstract interface c
  {
    public abstract void dk();

    public abstract void startListening();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.app.Fragment
 * JD-Core Version:    0.6.2
 */
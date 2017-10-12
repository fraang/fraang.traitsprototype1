package fraang.traitsprototype1;

final class CatSoundSource implements SoundSource<Cat> {
	private final Cat cat;

	private CatSoundSource(final Cat cat) {
		this.cat = cat;
	}

	public static final CatSoundSource asSoundSource(final Cat cat) {
		return new CatSoundSource(cat);
	}

	@Override
	public void emitSound() {
		System.out.println(cat.getSound());
	}
}

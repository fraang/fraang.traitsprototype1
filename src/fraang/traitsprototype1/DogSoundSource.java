package fraang.traitsprototype1;

final class DogSoundSource implements SoundSource<Dog> {
	private final Dog dog;

	private DogSoundSource(final Dog dog) {
		this.dog = dog;
	}

	public static final DogSoundSource asSoundSource(final Dog dog) {
		return new DogSoundSource(dog);
	}

	@Override
	public void emitSound() {
		System.out.println(dog.getSound2());
	}
}
